package com.user.service.services;

import com.user.service.entities.User;

import java.util.List;

public interface UserService {
    // define your operation here
    //create user
    public User saveUser(User user);

    //get all the user

    List<User> getAllUser();

    //get single user of userId

    public User getUser(String userId);

    //delete
    //update
}
