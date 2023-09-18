package com.example.config;

import com.example.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetails;

@EnableWebSecurity
@Configuration
@EnableMethodSecurity
@RequiredArgsConstructor

public class ApplicationConfig {
    private final UserRepository userRepository;

    @Bean
    public UserDetails userDetailsService() {


    }
}