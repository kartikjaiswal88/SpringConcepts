package com.SpringFeatures.LearningSpringConcepts;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring {

    public static void main(String[] args) {
        //1: Launch a Spring Context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        //3: Retrieving the Beans managed by the Spring with the help of it's name
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
//        System.out.println(context.getBean("address"));
        System.out.println(context.getBean("myAddress"));

//         Retrieving the Bean with the help of it's type
        System.out.println(context.getBean(Address.class));
        System.out.println(context.getBean(Person.class));

        // Retrieving the Bean which is Autowired with other Beans using Method Call
        System.out.println(context.getBean("person2MethodCall"));

        // Retrieving the Bean which is Autowired with other Beans using existing Beans as Parameters
        System.out.println(context.getBean("person3Parameters"));

        // Retrieving the bean which is Autowired with the help of Qualifier Bean
        System.out.println(context.getBean("person5Qualifier"));


        // Retrieving names of all the beans managed by the Spring context
        System.out.println();
        System.out.println("Printing all the Beans.......");
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

    }
}
