package com.exercise.spring_design_pattern_creational.singleton;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class SingletonApplication {

    @Bean
    public Counter counter() {
        return new Counter();
    }

}
