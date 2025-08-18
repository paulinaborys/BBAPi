package com.bbapi.movies_api.service;

import java.util.List;

import com.bbapi.movies_api.entity.User;

public interface UserService {
    
    public List<User> getAllUsers();
    public User getUserById();
    public User createUser();
}
