package com.mind2codes.gsemaquis.services.interfaces;

import java.util.List;

import com.mind2codes.gsemaquis.domain.User;
import com.mind2codes.gsemaquis.requests.UserRequest;

public interface UserService {

	User save(UserRequest user);
    List<User> findAll();
    User findOne(long id);
    void delete(long id);
    User findUserByEmail(String email);
}
