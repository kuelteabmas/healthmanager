package com.totaldevservices.waterintaketracker.service;

import com.totaldevservices.waterintaketracker.WaterIntakeTrackerRepository;
import com.totaldevservices.waterintaketracker.dto.WaterIntakeTrackerRequest;
import com.totaldevservices.waterintaketracker.dto.WaterIntakeTrackerResponse;
import com.totaldevservices.waterintaketracker.mapper.WaterIntakeTrackerMapper;
import com.totaldevservices.waterintaketracker.model.WaterIntakeTracker;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
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

    @Override
    public WaterIntakeTrackerResponse createWaterIntakeTracker(WaterIntakeTrackerRequest request) {
        WaterIntakeTracker waterIntakeTracker = new WaterIntakeTracker().builder()
                .localDateTimeOfWaterIntake(LocalDateTime.now())
                .amountOfWater(request.getAmountOfWater())
                .typeOfWater(request.getTypeOfWater())
                .waterEnhancement(request.getWaterEnhancement())
                .build();

        repository.save(waterIntakeTracker);

        WaterIntakeTrackerResponse response = waterIntakeTrackerMapper.apply(waterIntakeTracker);
        return response;
    }

    @Override
    public WaterIntakeTrackerResponse updateWaterIntakeTracker(WaterIntakeTrackerRequest request) {
        Optional<WaterIntakeTracker> waterIntakeTrackerOptional = repository.findById(request.getId());

        // TODO: Validate requestBody

        WaterIntakeTracker waterIntakeTracker = waterIntakeTrackerOptional.get();
        waterIntakeTracker.setAmountOfWater(request.getAmountOfWater());
        waterIntakeTracker.setLocalDateTimeOfWaterIntake(LocalDateTime.now());
        waterIntakeTracker.setTypeOfWater(request.getTypeOfWater());
        waterIntakeTracker.setWaterEnhancement(request.getWaterEnhancement());

        repository.save(waterIntakeTracker);

        WaterIntakeTrackerResponse response = waterIntakeTrackerMapper.apply(waterIntakeTracker);
        return response;
    }
}
