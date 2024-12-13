package com.javelin.mystream.services;

import com.javelin.mystream.models.Content;
import com.javelin.mystream.models.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {
    List<User> findAllUsers();

    ResponseEntity<String> saveUser(User user);

    List<Content> getUserWatchlist(User user);

    List<Content> getUserWatchNext(User user);
}
