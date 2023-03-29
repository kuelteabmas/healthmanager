package com.totaldevservices.waterintaketracker.service;

import com.totaldevservices.waterintaketracker.dto.WaterIntakeTrackerRequest;
import com.totaldevservices.waterintaketracker.dto.WaterIntakeTrackerResponse;

import java.util.List;
import java.util.UUID;

public interface WaterIntakeTrackerService {

    List<WaterIntakeTrackerResponse> getAllWaterIntakeTrackerItems();

    WaterIntakeTrackerResponse getWaterIntakeTrackerItemById(UUID id);

    WaterIntakeTrackerResponse createWaterIntakeTracker(WaterIntakeTrackerRequest request);

    WaterIntakeTrackerResponse updateWaterIntakeTracker(WaterIntakeTrackerRequest request);

    void deleteWaterIntakeTracker(UUID id);
}
