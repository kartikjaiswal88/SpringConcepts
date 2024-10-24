package com.SpringFeatures.LearningSpringConcepts.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

public interface GamingConsole {
    public void up();
    public void down();
    public void left();
    public void right();

}
