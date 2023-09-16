package com.abhi.spring.security.service;/*
    @author jadon
*/

import com.abhi.spring.security.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    List<User> list;
    UserService(){
        list = new ArrayList<>();
        list.add(new User("1", "Abhishek Jadon", "jadonabhi@gmil.com"));
        list.add(new User("2", "Aman Jadon", "aman@gmil.com"));
        list.add(new User("3", "Shikha Jadon", "shikha@gmil.com"));
        list.add(new User("4", "Abc Jadon", "abc@gmil.com"));
        list.add(new User("5", "Xyz Jadon", "jadoxyznabhi@gmil.com"));
    }

    public User getUser(String userId){
        User userReturn = null;
        for (User user : list){
            if (user.getUserId().equals(userId)){
                return user;
            }
        }
        return new User("dummyId", "Dummy", "dummay@gmial.com");
    }


    public User createUser(User user){
        boolean add = list.add(user);
        if (add) return user;
        return null;

    }



    public List<User> getAllUser(){
        return list;
    }
}
