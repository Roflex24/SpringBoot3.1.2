package com.example.SpringBoot312.service;

import com.example.SpringBoot312.model.User;

import java.util.List;

public interface UserService {
    User findById(Long id);

    List<User> findAll();

    User saveUser(User user);

    void deleteById(Long id);
}
