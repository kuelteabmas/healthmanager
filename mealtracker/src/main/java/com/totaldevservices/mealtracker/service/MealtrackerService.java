package com.totaldevservices.mealtracker.service;

import com.totaldevservices.mealtracker.dto.MealTrackerRequest;

public interface MealtrackerService {
    void createTracker(MealTrackerRequest mealTrackerRequest);
}
