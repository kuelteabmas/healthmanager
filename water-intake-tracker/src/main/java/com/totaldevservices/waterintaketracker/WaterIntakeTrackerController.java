package com.totaldevservices.waterintaketracker;

import com.totaldevservices.waterintaketracker.dto.WaterIntakeTracker;
import com.totaldevservices.waterintaketracker.service.WaterIntakeTrackerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.totaldevservices.waterintaketracker.enums.Constants.GET_CALL;
import static com.totaldevservices.waterintaketracker.enums.Constants.WATERINTAKETRACKER_CREATED;

@RestController
@RequestMapping("api/v1/waterintaketrackers")
@Slf4j
@AllArgsConstructor
public class WaterIntakeTrackerController {

    private WaterIntakeTrackerService waterIntakeTrackerService;

    @GetMapping
    public List<WaterIntakeTracker> getAllWaterIntakeTrackerItems() {
        log.info(GET_CALL.getMessage());
        List<WaterIntakeTracker> waterIntakeTrackers = waterIntakeTrackerService.getAllWaterIntakeTrackerItems();
        log.info(WATERINTAKETRACKER_CREATED.getMessage(), waterIntakeTrackers);

        return waterIntakeTrackers;
    }
}
