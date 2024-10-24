package com.SpringFeatures.LearningSpringConcepts.examples.a1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan // Automatically scan the current package for DI
public
class DependencyInjectionLauncherApplication {

    public static void main(String arg[]) {
        try (var context = new AnnotationConfigApplicationContext(DependencyInjectionLauncherApplication.class)) {

//            System.out.println(context.getBeanDefinitionNames());
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
