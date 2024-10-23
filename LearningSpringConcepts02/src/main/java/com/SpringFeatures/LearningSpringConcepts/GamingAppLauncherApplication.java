package com.SpringFeatures.LearningSpringConcepts;

import com.SpringFeatures.LearningSpringConcepts.game.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;




@Configuration
@ComponentScan("com.SpringFeatures.LearningSpringConcepts.game")
public class GamingAppLauncherApplication {

    public static void main(String arg[]) {
        try (var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {
//            GameRunner gameRunner = (GameRunner) context.getBean("gameRunner");
//            gameRunner.run();

            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}
