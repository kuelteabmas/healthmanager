package com.totaldevservices.waterintaketracker.service;

import com.totaldevservices.waterintaketracker.WaterIntakeTrackerRepository;
import com.totaldevservices.waterintaketracker.dto.WaterIntakeTrackerResponse;
import com.totaldevservices.waterintaketracker.mapper.WaterIntakeTrackerMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class WaterIntakeTrackerServiceImpl implements WaterIntakeTrackerService {

    private final WaterIntakeTrackerRepository repository;
    private final WaterIntakeTrackerMapper waterIntakeTrackerMapper;

    @Override
    public List<WaterIntakeTrackerResponse> getAllWaterIntakeTrackerItems() {
        List<WaterIntakeTrackerResponse> waterIntakeTrackerResponses = repository.findAll()
                .stream()
                .map(waterIntakeTrackerMapper)
                .collect(Collectors.toList());

        return waterIntakeTrackerResponses;
    }
}
