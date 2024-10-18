package com.SpringFeatures.LearningSpringConcepts;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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

        // Retrieving the Bean with the help of it's type
//        System.out.println(context.getBean(Address.class));

        // Retrieving the Bean which is Autowired with other Beans using Method Call
        System.out.println(context.getBean("person2MethodCall"));

        // Retrieving the Bean which is Autowired with other Beans using existing Beans as Parameters
        System.out.println(context.getBean("person3Parameters"));

    }
}
