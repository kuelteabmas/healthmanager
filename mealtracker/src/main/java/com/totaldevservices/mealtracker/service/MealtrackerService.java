package com.totaldevservices.mealtracker.service;

import com.totaldevservices.mealtracker.dto.MealTrackerRequest;
import com.totaldevservices.mealtracker.dto.MealtrackerResponse;

import java.util.List;

public interface MealtrackerService {

    List<MealtrackerResponse> getAllMealtrackers();

    void createTracker(MealTrackerRequest mealTrackerRequest);
}
