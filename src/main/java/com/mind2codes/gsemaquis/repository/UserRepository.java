package com.mind2codes.gsemaquis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mind2codes.gsemaquis.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String userName);

}
