package com.mind2codes.gsemaquis.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.mind2codes.gsemaquis.domain.User;
import com.mind2codes.gsemaquis.repository.UserRepository;

@Component
public class AppUserDetailsService implements UserDetailsService {
    
	private static final Logger logger = LogManager.getLogger(AppUserDetailsService.class);
	
	@Autowired
	UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
    	
        User user = userRepository.findByEmail(s);

        if(user == null) {
        	logger.error("The username %s doesn't exist");
            throw new UsernameNotFoundException(String.format("The username %s doesn't exist", s));
        }

        List<GrantedAuthority> authorities = new ArrayList<>();
        user.getRoles().forEach(role -> {
            authorities.add(new SimpleGrantedAuthority(role.getRoleName()));
        });

        UserDetails userDetails = new org.springframework.security.core.userdetails.
                User(user.getEmail(), user.getPassword(), authorities);

        return userDetails;
    }
    
    private List getAuthority() {
        return Arrays.asList(new SimpleGrantedAuthority("CLIENT"));
    }
}
