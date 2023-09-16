package com.abhi.spring.security.controller;/*
    @author jadon
*/

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class PublicController {

    @GetMapping("/")
    public String publicHandler(){
        return
                "This is the default landing page for admin as well as Normal user || Now you can set your Url";
    }

}
