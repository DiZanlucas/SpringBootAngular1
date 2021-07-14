package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {
    
    @Bean (name = "nomeAplicacao")
    public String nomeAplicacao(){
        return "SpringBootAngular";
    }
}
