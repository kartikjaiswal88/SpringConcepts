package com.SpringFeatures.LearningSpringConcepts.exerciseDB;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Primary
@Repository // Used for Beans which talks to the Data
public class MongoDbDataService implements DataService{
    @Override
    public int[] retrieveData() {
        return new int[] {14,50,37,62,93,32};
    }
}
