package com.totaldevservices.waterintaketracker.service;

import com.totaldevservices.waterintaketracker.WaterIntakeTrackerRepository;
import com.totaldevservices.waterintaketracker.dto.WaterIntakeTracker;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class WaterIntakeTrackerServiceImpl implements WaterIntakeTrackerService {

    private final WaterIntakeTrackerRepository repository;

    @Override
    public List<WaterIntakeTracker> getAllWaterIntakeTrackerItems() {
        List<WaterIntakeTracker> waterIntakeTrackers = repository.findAll();
        return waterIntakeTrackers;
    }
}
