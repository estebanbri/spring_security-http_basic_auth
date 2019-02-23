package com.example.HTTPBasicAuthentication.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

@Component
public class CustomUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String s) {
        UserDetails user = User.withDefaultPasswordEncoder()
                               .username("batman")
                               .password("123")
                               .roles("USER")
                                    .build();
        return user;
    }
}
