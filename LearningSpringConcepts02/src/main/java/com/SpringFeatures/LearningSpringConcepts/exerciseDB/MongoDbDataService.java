package com.SpringFeatures.LearningSpringConcepts.exerciseDB;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDbDataService implements DataService{
    @Override
    public int[] retrieveData() {
        return new int[] {14,50,37,62,93,32};
    }
}
