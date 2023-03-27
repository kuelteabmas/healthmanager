package com.totaldevservices.waterintaketracker.service;

import com.totaldevservices.waterintaketracker.dto.WaterIntakeTrackerResponse;

import java.util.List;

public interface WaterIntakeTrackerService {

    List<WaterIntakeTrackerResponse> getAllWaterIntakeTrackerItems();
}
