package com.SpringFeatures.LearningSpringConcepts.exerciseDB;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;

//@Component
@Service // Used for Business Logic Beans
public class BusinessCalculationService {
    private DataService dataService;

    public BusinessCalculationService(DataService dataService)
    {
        this.dataService = dataService;
    }

    public int findMax(){
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
