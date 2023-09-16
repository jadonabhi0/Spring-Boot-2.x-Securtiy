package com.abhi.spring.security.controller;/*
    @author jadon
*/

import com.abhi.spring.security.entity.User;
import com.abhi.spring.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {


    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping("/get-all")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @GetMapping("/get/{userId}")
    public User getUser(@PathVariable String userId){
        return userService.getUser(userId);
    }

}
