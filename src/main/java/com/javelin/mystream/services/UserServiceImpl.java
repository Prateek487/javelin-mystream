package com.javelin.mystream.services;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javelin.mystream.repositories.UserRepository;

import com.javelin.mystream.models.Content;
import com.javelin.mystream.models.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAllUsers(){
        return userRepository.findAll();
    }

    @Override
    public ResponseEntity<String> saveUser(User user){
        userRepository.save(user);

        return new ResponseEntity<>("User Saved successfully", HttpStatus.OK);
    }

    @Override
    public List<Content> getUserWatchlist(User user) {
        return List.of();
    }

    @Override
    public List<Content> getUserWatchNext(User user) {
        return List.of();
    }
}
