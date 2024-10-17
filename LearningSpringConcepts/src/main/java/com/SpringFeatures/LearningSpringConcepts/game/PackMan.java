package com.SpringFeatures.LearningSpringConcepts.game;

public class PackMan implements GamingConsole {
    @Override
    public void up() {
        System.out.println("Going Up");
    }

    @Override
    public void down() {
        System.out.println("Going Down");
    }

    @Override
    public void left() {
        System.out.println("Going left");
    }

    @Override
    public void right() {
        System.out.println("Going right");
    }
}
