package com.stackroute.LoginService.service;

import com.stackroute.LoginService.model.User;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

public interface UserService {
    User saveUser(User user) throws Exception;
    List<User> getAllUsers();  ///RETRIEVE users

    User findByUserIdAndPassword(String username,String password);
}
