package com.SpringFeatures.LearningSpringConcepts.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


record Person(String name, int age, Address address) {
}

record Address(String firstLine, String city) {
}

@Configuration
//2: Configure the things that we want Spring to manage- @Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Kartik Jaiswal";
    }

    @Bean
    public int age() {
        return 22;
    }

    @Bean
    @Primary
    public Person person() {
        var person = new Person("Kartik Jaiswal", 22, new Address("Babron", "Kurawar"));
        System.out.println(person.toString());
        return person;
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address());  // Autowiring the Bean using Method Call
    }

    @Bean
    public Person person3Parameters(String name, int age, Address friendAddress) {
        return new Person(name, age, friendAddress);  // Autowiring the Bean using existing Beans as Parameters
    }

    @Bean
    public Person person4Parameters(String name, int age, Address address) {
        return new Person(name, age, address);  // Autowiring the Bean using existing Beans as Parameters
    }

    @Bean
    public Person person5Qualifier(String name, int age, @Qualifier("friendAddressQualifier") Address address) {
        return new Person(name, age, address);  // Autowiring the Bean using existing Beans as Parameters
    }

    @Bean(name = "myAddress")
    @Primary
    public Address address() {
        return new Address("Babron", "Kurawar");
    }

    @Bean(name = "friendAddress")
    @Qualifier("friendAddressQualifier")
    public Address addressFriend() {
        return new Address("NariyalKheda", "Bhopal");
    }
}
