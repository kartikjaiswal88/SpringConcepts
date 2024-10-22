package com.SpringFeatures.LearningSpringConcepts;

import com.SpringFeatures.LearningSpringConcepts.game.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GamingConfiguration {
//    var marioGame = new MarioGame();
//    var superContra = new SuperContra();
//    var packMan = new PackMan();  // 1.Object Creation
//    var gameRunner = new GameRunner(packMan); // 2.Object Creation + Wiring of Dependencies(Game is Dependency)
//
//        gameRunner.run();

    @Bean
    public GamingConsole game() {
        var game = new PackMan();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        return new GameRunner(game);
    }

}
