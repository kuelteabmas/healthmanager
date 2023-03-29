package com.totaldevservices.waterintaketracker.service;

import com.totaldevservices.waterintaketracker.dto.WaterIntakeTrackerRequest;
import com.totaldevservices.waterintaketracker.dto.WaterIntakeTrackerResponse;

import java.util.List;

public interface WaterIntakeTrackerService {

    List<WaterIntakeTrackerResponse> getAllWaterIntakeTrackerItems();

    WaterIntakeTrackerResponse createWaterIntakeTracker(WaterIntakeTrackerRequest request);

    WaterIntakeTrackerResponse updateWaterIntakeTracker(WaterIntakeTrackerRequest request);
}
