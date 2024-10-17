package com.SpringFeatures.LearningSpringConcepts;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
//2: Configure the things that we want Spring to manage- @Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Kartik Jaiswal";
    }
}
