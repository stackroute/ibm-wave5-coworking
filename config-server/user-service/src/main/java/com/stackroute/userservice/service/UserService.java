package com.stackroute.userservice.service;

import com.stackroute.userservice.domain.User;
import com.stackroute.userservice.exception.UserAlreadyExists;
import com.stackroute.userservice.exception.UserNotFoundException;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();
    public User saveUser(User user) throws  UserAlreadyExists;
    //public boolean deleteUser(String emailId) throws UserNotFoundException;

    public boolean deleteUser(User user) throws Exception;
    public User updateUser(User user) throws UserNotFoundException;
}
