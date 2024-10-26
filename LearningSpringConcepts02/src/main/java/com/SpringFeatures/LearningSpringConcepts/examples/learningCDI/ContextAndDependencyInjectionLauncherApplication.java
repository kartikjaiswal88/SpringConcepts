package com.SpringFeatures.LearningSpringConcepts.examples.learningCDI;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;


//@Component
@Named // CDI: Alternatives to Spring Annotations
class BusinessService {
    private DataService dataService;

//    @Autowired
    @Inject // CDI
    public void setDataService(DataService dataService) {
        System.out.println("Setter Injection....");
        this.dataService = dataService;
    }

    public DataService getDataService() {
        return dataService;
    }

}

//@Component
@Named
class DataService {

}

@Configuration
@ComponentScan // Automatically scan the current package for DI
public
class ContextAndDependencyInjectionLauncherApplication {

    public static void main(String arg[]) {
        try (var context = new AnnotationConfigApplicationContext(ContextAndDependencyInjectionLauncherApplication.class)) {

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(BusinessService.class).getDataService());
        }
    }
}
