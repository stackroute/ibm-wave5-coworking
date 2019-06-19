package com.stackroute.userservice.service;

import com.stackroute.userservice.domain.User;
import com.stackroute.userservice.exception.UserAlreadyExists;
import com.stackroute.userservice.exception.UserNotFoundException;
import com.stackroute.userservice.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

//import static javax.swing.text.html.parser.DTDConstants.ID;

@Service
public class UserServiceImpl implements UserService {
    UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User saveUser(User user) throws UserAlreadyExists {

        if (userRepository.existsByEmailId(user.getEmailId()))
            throw new UserAlreadyExists("user Already Exists");

        User savedUser = userRepository.save(user);
        return savedUser;
    }

//    @Override
//    public boolean deleteUser(String emailId) throws UserNotFoundException {
//
//        boolean status = false;
//        if (userRepository.existsById(emailId)) {
//            userRepository.deleteByEmailId(emailId);
//            status = true;
//
//            return status;
//        }


    @Override
    public boolean deleteUser(User user) throws Exception {
        if (userRepository.existsByEmailId(user.getEmailId())) {
            userRepository.deleteByEmailId(user.getEmailId());
            return true;
        } else {
            throw new Exception("Exception in deleteTrack");
        }

//        else{
//              throw new UserNotFoundException("user emailId not exists");
//            }

    }
    @Override
    public User updateUser(User user) throws UserNotFoundException {
        if (userRepository.existsByEmailId(user.getEmailId())) {
            User saveUser = userRepository.save(user);
            return saveUser;
        } else {
            throw new UserNotFoundException("user not found");
        }

    }


}
