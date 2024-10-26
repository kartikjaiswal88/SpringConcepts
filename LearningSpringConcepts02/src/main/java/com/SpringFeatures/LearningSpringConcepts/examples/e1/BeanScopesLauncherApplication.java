package com.SpringFeatures.LearningSpringConcepts.examples.e1;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class NormalClass {

}

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class PrototypeClass {

}


@Configuration
@ComponentScan // Automatically scan the current package for DI
public
class BeanScopesLauncherApplication {

    public static void main(String arg[]) {
        try (var context = new AnnotationConfigApplicationContext(BeanScopesLauncherApplication.class)) {

            // Singleton: One object instance per Spring IOC Container
            // Prototype: Possibly many object instance per Spring IOC Container
            // Request: One object instance per single HTTP request
            // Session: One object instance per user HTTP Session
            // Application: One object instance per web application runtime
            // WebSocket: One object instance per WebSocket instance


            // By default all the Beans in Spring Container are Single i.e it would refer the same instance everytime
            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(NormalClass.class));


            // In Prototype Bean Scope, Spring would create different instance everytime we retrieve
            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
        }
    }
}
