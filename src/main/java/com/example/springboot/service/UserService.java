package com.example.springboot.service;

import com.example.springboot.entity.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserService {

    @Transactional
    List<User> allUsers();

    @Transactional
    void add(User user);

    @Transactional
    void update(User user);

    @Transactional
    void delete(Integer id);

    @Transactional
    User get(Integer id);
}
