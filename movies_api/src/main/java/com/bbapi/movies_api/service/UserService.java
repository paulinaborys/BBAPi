package com.bbapi.movies_api.service;

import java.util.List;

import com.bbapi.movies_api.entity.User;

public interface UserService {
    
    public List<User> getAllUsers();
    public User getUserById(Long id);
    public User createUser(User user);
    public void deleteUser(Long id);
}
