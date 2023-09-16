package com.abhi.spring.security.repositary;/*
    @author jadon
*/

import com.abhi.spring.security.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositary extends JpaRepository<User, String> {
    User findByName(String username);
}
