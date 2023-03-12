package com.totaldevservices.mealtracker.service;

import com.totaldevservices.mealtracker.dto.Meal;
import com.totaldevservices.mealtracker.dto.MealTrackerRequest;
import com.totaldevservices.mealtracker.dto.Mealtracker;
import org.springframework.stereotype.Service;

@Service
public class MealtrackerServiceImpl implements MealtrackerService {

    @Override
    public void createTracker(MealTrackerRequest request) {

        Mealtracker mealtracker = Mealtracker.builder()
                .meal(request.getMeal())
                .localDateTimeOfMeal(request.getLocalDateTimeOfMeal())
                .feltIll(request.isFeltIll())
                .illSymptoms(request.getIllSymptoms())
                .build();


        // todo: check if tracker is valid
        // todo: store tracker in db
    }
}
