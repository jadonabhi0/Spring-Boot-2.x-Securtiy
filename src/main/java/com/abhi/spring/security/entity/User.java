package com.abhi.spring.security.entity;/*
    @author jadon
*/

import lombok.*;
import org.springframework.stereotype.Service;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "User_Details_Spring_security_2.x")
public class User {

    @Id
    @Column(name = "User_id")
    private String userId;

    @Column(name = "user_name")
    private String name;

    @Column(name = "User_email")
    private String email;

    private String password;

    @Column(name = "User_role")
    private String role;


}
