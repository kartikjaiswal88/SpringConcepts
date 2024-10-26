package com.SpringFeatures.LearningSpringConcepts.exerciseDB;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository // Used for Beans which talks to the Data
public class MySqlDataService implements DataService {
    @Override
    public int[] retrieveData() {
        return new int[] {33,5,33,78,23,98,12};
    }
}
