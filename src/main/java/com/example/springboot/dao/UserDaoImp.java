package com.example.springboot.dao;

import com.example.springboot.entity.User;
import org.springframework.stereotype.Component;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;


@Repository
public class UserDaoImp implements UserDao {

    @PersistenceContext
    EntityManager entityManager;


    @Override
    public List<User> allUsers() {
        List<User> user = entityManager.createQuery("from User", User.class).getResultList();
        return user;
    }

    @Override
    public void add(User user) {
        entityManager.persist(user);
    }

    @Override
    public void update(User user) {
        entityManager.merge(user);
    }

    @Override
    public void delete(Integer id) {
        User user = entityManager.find(User.class, id);
        entityManager.remove(user);
    }

    @Override
    public User get(Integer id) {
        return entityManager.find(User.class, id);
    }
}
