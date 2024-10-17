package com.SpringFeatures.LearningSpringConcepts;

import com.SpringFeatures.LearningSpringConcepts.game.GameRunner;
import com.SpringFeatures.LearningSpringConcepts.game.MarioGame;
import com.SpringFeatures.LearningSpringConcepts.game.PackMan;
import com.SpringFeatures.LearningSpringConcepts.game.SuperContra;

public class App01GamingBasicJava {

    public static void main(String arg[]) {
        var marioGame = new MarioGame();
        var superContra = new SuperContra();
        var packMan = new PackMan();  // 1.Object Creation
        var gameRunner = new GameRunner(packMan); // 2.Object Creation + Wiring of Dependencies(Game is Dependency)

        gameRunner.run();
    }
}
