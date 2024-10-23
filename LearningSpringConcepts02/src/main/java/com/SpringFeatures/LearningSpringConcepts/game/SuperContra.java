package com.SpringFeatures.LearningSpringConcepts.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraQualifier")
public class SuperContra implements GamingConsole {
    public void up() {
        System.out.println("Up");
    }

    public void down() {
        System.out.println("Sit Down");
    }

    public void left() {
        System.out.println("Go Back");
    }

    public void right() {
        System.out.println("Shoot a bullet");
    }
}
