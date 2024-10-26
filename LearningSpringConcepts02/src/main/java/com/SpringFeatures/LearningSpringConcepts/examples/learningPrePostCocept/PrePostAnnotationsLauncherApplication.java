package com.SpringFeatures.LearningSpringConcepts.examples.learningPrePostCocept;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeClass {
    private SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency) {
        this.someDependency = someDependency;
        System.out.println("Dependencies are ready to go!");
    }

    @PostConstruct // This will call the method after the dependency or bean is initialized or injected
    public void initialization() {
        someDependency.getReady();
    }

    @PreDestroy // This will call the method before destroying the bean
    public void cleanup() {
        System.out.println("Cleaning up the Resources");
    }

}

@Component
class SomeDependency {

    public void getReady() {
        System.out.println("Some logic using SomeDependency!");
    }
}


@Configuration
@ComponentScan // Automatically scan the current package for DI
public
class PrePostAnnotationsLauncherApplication {

    public static void main(String arg[]) {
        try (var context = new AnnotationConfigApplicationContext(PrePostAnnotationsLauncherApplication.class)) {

//            System.out.println(context.getBeanDefinitionNames());
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
