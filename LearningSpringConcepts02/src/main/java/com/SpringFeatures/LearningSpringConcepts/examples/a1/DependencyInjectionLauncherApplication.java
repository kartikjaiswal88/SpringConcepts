package com.SpringFeatures.LearningSpringConcepts.examples.a1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class YourBusinessClass{
    Dependency1 dependency1;
    Dependency2 dependency2;

    @Autowired
    public void setDependency1(Dependency1 dependency1) {
        System.out.println("Setter Injection:- dependency1");
        this.dependency1 = dependency1;
    }
    @Autowired
    public void setDependency2(Dependency2 dependency2) {
        System.out.println("Setter Injection:- dependency2");
        this.dependency2 = dependency2;
    }

    @Override
    public String toString(){
        return "Using==>  " + dependency1 + " and " + dependency2;
    }

}
@Component
class Dependency1{

}
@Component
class Dependency2{

}

@Configuration
@ComponentScan // Automatically scan the current package for DI
public
class DependencyInjectionLauncherApplication {

    public static void main(String arg[]) {
        try (var context = new AnnotationConfigApplicationContext(DependencyInjectionLauncherApplication.class)) {

//            System.out.println(context.getBeanDefinitionNames());
//            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            var yourBusinessClass = context.getBean(YourBusinessClass.class);
            System.out.println(yourBusinessClass);
        }
    }
}
