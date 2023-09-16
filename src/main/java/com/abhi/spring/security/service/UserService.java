package com.abhi.spring.security.service;/*
    @author jadon
*/

import com.abhi.spring.security.entity.User;
import com.abhi.spring.security.repositary.UserRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserRepositary userRepositary;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User getUser(String userId){

        return this.userRepositary.findById(userId).orElseThrow(()->new UsernameNotFoundException("User not found"));

    }


    public User createUser(User user){
        user.setUserId(UUID.randomUUID().toString());
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        User save = this.userRepositary.save(user);
        return save;
    }


    public List<User> getAllUser() {
        return this.userRepositary.findAll();
    }
}
