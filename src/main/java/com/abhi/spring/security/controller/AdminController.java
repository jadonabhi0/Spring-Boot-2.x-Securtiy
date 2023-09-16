package com.abhi.spring.security.controller;/*
    @author jadon
*/

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {


    @GetMapping("/home")
    public String home(){
        return "Welcome to home";
    }

    @GetMapping("signin")
    public String signin(){
        return "Welcome to signin";
    }

    @GetMapping("/login")
    public String login(){
        return "Welcome to login";
    }

}
