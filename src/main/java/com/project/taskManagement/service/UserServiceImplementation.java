package com.project.taskManagement.service;

import com.project.taskManagement.config.JwtProvider;
import com.project.taskManagement.modal.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.taskManagement.repository.UserRepository;

import java.util.List;

@Service
public class UserServiceImplementation implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUserProfile(String jwt) {
        String email= JwtProvider.getEmailFromJwtToken(jwt);
        return userRepository.findByEmail(email);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}