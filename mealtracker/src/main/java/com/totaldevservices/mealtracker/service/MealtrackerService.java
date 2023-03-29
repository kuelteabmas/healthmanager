package com.totaldevservices.mealtracker.service;

import com.totaldevservices.mealtracker.dto.MealTrackerRequest;
import com.totaldevservices.mealtracker.dto.MealtrackerResponse;

import java.util.List;
import java.util.UUID;

public interface MealtrackerService {

    List<MealtrackerResponse> getAllMealtrackers();

    MealtrackerResponse getMealtrackerById(UUID id);

    void createTracker(MealTrackerRequest mealTrackerRequest);
}
