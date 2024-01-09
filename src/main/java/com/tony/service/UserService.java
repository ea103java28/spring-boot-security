package com.tony.service;


import com.tony.model.User;

import java.util.List;

public interface UserService {

    User findById(String id);

    User findByEmail(String email);

    List<User> findAll();

    void insert(User user);
}
