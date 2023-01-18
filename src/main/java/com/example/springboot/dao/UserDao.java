package com.example.springboot.dao;

import com.example.springboot.entity.User;

import java.util.List;

public interface UserDao {
    List<User> allUsers();

    void add(User user);

    void update(User user);

    void delete(Integer id);

    User get(Integer id);
}
