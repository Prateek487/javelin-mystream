package com.javelin.mystream.contollers;

import com.javelin.mystream.models.Content;
import com.javelin.mystream.models.User;
import com.javelin.mystream.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping("users")
    public List<User> getAllUsers(){
        return userService.findAllUsers();
    }

    @PostMapping("save")
    public ResponseEntity<String> saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping("watchlist")
    public List<Content> getWatchList(@RequestBody User user){
        return userService.getUserWatchlist(user);
    }

    @GetMapping("watchnext")
    public List<Content> getWatchNext(@RequestBody User user){
        return userService.getUserWatchNext(user);
    }
}
