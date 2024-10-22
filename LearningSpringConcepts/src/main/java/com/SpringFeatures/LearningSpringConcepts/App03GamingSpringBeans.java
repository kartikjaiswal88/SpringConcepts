package com.SpringFeatures.LearningSpringConcepts;

import com.SpringFeatures.LearningSpringConcepts.game.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {

    public static void main(String arg[]) {
        try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
//            GameRunner gameRunner = (GameRunner) context.getBean("gameRunner");
//            gameRunner.run();

            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}
