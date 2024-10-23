package com.SpringFeatures.LearningSpringConcepts;

import com.SpringFeatures.LearningSpringConcepts.game.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;




@Configuration
@ComponentScan("com.SpringFeatures.LearningSpringConcepts.game")
public class App03GamingSpringBeans {

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        return new GameRunner(game);
    }

    public static void main(String arg[]) {
        try (var context = new AnnotationConfigApplicationContext(App03GamingSpringBeans.class)) {
//            GameRunner gameRunner = (GameRunner) context.getBean("gameRunner");
//            gameRunner.run();

            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}
