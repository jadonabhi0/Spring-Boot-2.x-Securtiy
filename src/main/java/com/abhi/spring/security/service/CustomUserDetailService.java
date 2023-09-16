package com.abhi.spring.security.service;/*
    @author jadon
*/

import com.abhi.spring.security.entity.CustomUserDetails;
import com.abhi.spring.security.entity.User;
import com.abhi.spring.security.repositary.UserRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailService implements UserDetailsService
{
    @Autowired
    private UserRepositary userRepositary;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = this.userRepositary.findByName(username);
        if(user == null) throw new UsernameNotFoundException("User not exist with name : "+ username);
        return new CustomUserDetails(user);
    }
}
