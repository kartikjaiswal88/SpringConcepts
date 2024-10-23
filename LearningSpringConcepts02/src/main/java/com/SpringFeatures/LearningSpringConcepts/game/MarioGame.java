package com.SpringFeatures.LearningSpringConcepts.game;

public class MarioGame implements GamingConsole {
    public void up() {
        System.out.println("Jump");
    }

    public void down() {
        System.out.println("Going into the hole");
    }

    public void left() {
        System.out.println("Go Back");
    }

    public void right() {
        System.out.println("Accelerate");
    }
}