package com.channel.custom.local.springsecuritydemo.service;

import com.channel.custom.local.springsecuritydemo.dto.JwtResponse;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    public JwtResponse login(String clientId, String clientSecret) {
        return JwtResponse.builder()
            .tokenType("Bearer")
            .build();
    }
}
