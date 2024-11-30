package com.project.taskManagement.service;

import com.project.taskManagement.modal.User;

import java.util.List;

public interface UserService {
    public User getUserProfile(String jwt);
    public List<User> getAllUsers();
}
