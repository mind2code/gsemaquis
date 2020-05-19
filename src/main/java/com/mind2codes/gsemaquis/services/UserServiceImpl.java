package com.mind2codes.gsemaquis.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mind2codes.gsemaquis.domain.Role;
import com.mind2codes.gsemaquis.domain.User;
import com.mind2codes.gsemaquis.exceptions.EmailExistsException;
import com.mind2codes.gsemaquis.repository.RoleRepository;
import com.mind2codes.gsemaquis.repository.UserRepository;
import com.mind2codes.gsemaquis.requests.UserRequest;
import com.mind2codes.gsemaquis.services.interfaces.UserService;

@Service(value = "userService")
public class UserServiceImpl implements UserDetailsService, UserService {
	
	private static final Logger logger = LogManager.getLogger(UserServiceImpl.class);
	
	@Autowired
	private UserRepository userDao;
	
	@Autowired
	RoleRepository roleRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	/**
	 * Récupérer les informations de l'utilisateur à partir de son email
	 */
	public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
		User user = userDao.findByEmail(userId);
		if(user == null){
			logger.info("Username ou mot de passe invalide");
			throw new UsernameNotFoundException("Username ou mot de passe invalide");
		}
		return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), getAuthority());
	}

	private List<SimpleGrantedAuthority> getAuthority() {
		return Arrays.asList(new SimpleGrantedAuthority("ADMIN"));
	}

	/**
	 * Récupérer tous les utilisateurs
	 */
	public List<User> findAll() {
		List<User> list = new ArrayList<>();
		userDao.findAll().iterator().forEachRemaining(list::add);
		return list;
	}

	/**
	 * Récupère un seul utilisateur
	 */
	@Override
	public User findOne(long id) {
		return userDao.findById(id).get();
	}

	/**
	 * Supprimer un utilisateur
	 */
	@Override
	public void delete(long id) {
		userDao.deleteById(id);
	}

	/**
	 * Enregistre un utilisateur, mais avant vérifie s'il n'existe pas deja
	 */
	@Override
	@Transactional
    public User save(UserRequest request) {
		try {
			
			User u = userDao.findByEmail(request.getEmail());
			if (u == null)
			{
				User user = new User();
				user.setFirstName(request.getFirstName());
				user.setLastName(request.getLastName());
				user.setEmail(request.getEmail());
				user.setTelephone(request.getTelephone());
			
				if(request.getId() == 0) {
					
					user.setPassword(passwordEncoder.encode(request.getPassword()));
					
					Role role = roleRepository.findById(request.getRoleId()).get();
					Set<Role> roles = new HashSet<>();
					Set<User> users = new HashSet<>();
					roles.add(role);
					user.setRoles(roles);
					users.add(user);
					role.setUser(users);
					
				}
			
				return userDao.save(user);
			} else {
				logger.info("Un utilisateur existe déjà avec cet email");
				throw new 
					EmailExistsException("Un utilisateur existe déjà avec cet email");
			}
		} catch (Exception ex) {
			logger.error(ex);
			throw ex;
		}
    }

	@Override
	public User findUserByEmail(String email) {
		// TODO Auto-generated method stub
		return userDao.findByEmail(email);
	}
}