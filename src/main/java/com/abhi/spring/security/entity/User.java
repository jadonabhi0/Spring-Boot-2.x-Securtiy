package com.abhi.spring.security.entity;/*
    @author jadon
*/

import lombok.*;
import org.springframework.stereotype.Service;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    private String userId;

    private String name;

    private String email;


}
