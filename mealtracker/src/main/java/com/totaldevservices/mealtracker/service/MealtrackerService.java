package com.totaldevservices.mealtracker.service;

import com.totaldevservices.mealtracker.dto.MealTrackerRequest;
import com.totaldevservices.mealtracker.dto.Mealtracker;

import java.util.List;

public interface MealtrackerService {

    List<Mealtracker> getAllMealtrackers();

    void createTracker(MealTrackerRequest mealTrackerRequest);
}
