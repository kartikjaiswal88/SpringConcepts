package com.SpringFeatures.LearningSpringConcepts.exerciseDB;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class RealWorldRetriveDataExercise {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(RealWorldRetriveDataExercise.class)) {
            System.out.println(context.getBean(BusinessCalculationService.class).findMax());
        }
    }
}
