package com.SpringFeatures.LearningSpringConcepts.game;

public class GameRunner {
    private GamingConsole game;
    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running......");
        game.up();
        game.down();
        game.right();
        game.left();
    }
}
