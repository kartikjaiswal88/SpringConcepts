package com.SpringFeatures.LearningSpringConcepts;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

    public static void main(String[] args) {
        //1: Launch a Spring Context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        //3: Retrieving the Beans managed by the Spring
        System.out.println(context.getBean("name"));

    }
}
