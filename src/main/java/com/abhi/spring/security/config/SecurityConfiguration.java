package com.abhi.spring.security.config;/*
    @author jadon
*/

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
                                        http
                                        .csrf()
                                        .disable()
                                        .authorizeRequests()
                                        .antMatchers("/admin/**").hasRole("admin")
                                        .antMatchers("/user/**").hasRole("users")
                                        .anyRequest()
                                        .authenticated()
                                        .and()
                                        .httpBasic();
    }


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("abhishek").password(passwordEncoder().encode("abc")).roles("admin");
        auth.inMemoryAuthentication().withUser("aman").password(passwordEncoder().encode("abc")).roles("user");
    }


    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
