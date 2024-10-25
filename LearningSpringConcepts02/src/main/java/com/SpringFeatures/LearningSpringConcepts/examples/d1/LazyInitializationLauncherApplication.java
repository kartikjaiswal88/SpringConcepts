package com.SpringFeatures.LearningSpringConcepts.examples.d1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class ClassA {

}

@Component
@Lazy  // Default is Eager(Recommended) as it will discover errors at the startup of the application
class ClassB {
    private ClassA classA;


    public ClassB(ClassA classA) {
        System.out.println("Some Initialization...................");
        this.classA = classA;
    }

    public void doSomething() {
        System.out.println("Doing Something.......");
    }
}


@Configuration
@ComponentScan // Automatically scan the current package for DI
public
class LazyInitializationLauncherApplication {

    public static void main(String arg[]) {
        try (var context = new AnnotationConfigApplicationContext(LazyInitializationLauncherApplication.class)) {
            System.out.println("Initialization of Context is Completed........");

            // When particular bean is reffered then Initialization is done if annoted with @Lazy, otherwise at the time of context Initialization
            context.getBean(ClassB.class).doSomething();

        }
    }
}
