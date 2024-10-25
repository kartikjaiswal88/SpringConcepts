package com.SpringFeatures.LearningSpringConcepts.exerciseDB;

import org.springframework.stereotype.Component;

@Component
public class MySqlDataService implements DataService {
    @Override
    public int[] retrieveData() {
        return new int[] {33,5,33,78,23,98,12};
    }
}
