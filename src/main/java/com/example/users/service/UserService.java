package com.example.users.service;

import com.example.users.model.User;

import java.util.List;

public interface UserService{

    List<User> getAll();

    void addUser(User user);

    void removeUser(int id);

    void updateUser(int id, User user) throws Exception;

    User getUserById(int id);
}
