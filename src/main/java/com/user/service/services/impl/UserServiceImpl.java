package com.user.service.services.impl;

import com.user.service.entities.User;
import com.user.service.execption.ResourceNotFoundException;
import com.user.service.repositories.UserRepository;
import com.user.service.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    @Override
    public User saveUser(User user) {
        // generate unique user id
        String randomUserId = UUID.randomUUID().toString();
        user.setUserId(randomUserId);
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String userId) {
        User userById = userRepository.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User with given Id is not found server : "+userId));
        return userById;
    }
}
