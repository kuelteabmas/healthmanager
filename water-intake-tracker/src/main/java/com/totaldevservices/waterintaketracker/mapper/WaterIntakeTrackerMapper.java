package com.totaldevservices.waterintaketracker.mapper;

import com.totaldevservices.waterintaketracker.dto.WaterIntakeTrackerResponse;
import com.totaldevservices.waterintaketracker.model.WaterIntakeTracker;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class WaterIntakeTrackerMapper implements Function<WaterIntakeTracker, WaterIntakeTrackerResponse> {
    @Override
    public WaterIntakeTrackerResponse apply(WaterIntakeTracker waterIntakeTracker) {
        return new WaterIntakeTrackerResponse(
                waterIntakeTracker.getId(),
                waterIntakeTracker.getAmountOfWater(),
                waterIntakeTracker.getLocalDateTimeOfWaterIntake(),
                waterIntakeTracker.getTypeOfWater(),
                waterIntakeTracker.getWaterEnhancement()
        );
    }
}
