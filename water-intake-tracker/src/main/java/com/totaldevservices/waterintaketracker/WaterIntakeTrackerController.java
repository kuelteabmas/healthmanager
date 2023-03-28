package com.totaldevservices.waterintaketracker;

import com.totaldevservices.waterintaketracker.dto.WaterIntakeTrackerRequest;
import com.totaldevservices.waterintaketracker.dto.WaterIntakeTrackerResponse;
import com.totaldevservices.waterintaketracker.service.WaterIntakeTrackerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.totaldevservices.waterintaketracker.enums.Constants.*;

@RestController
@RequestMapping("api/v1/waterintaketrackers")
@Slf4j
@AllArgsConstructor
public class WaterIntakeTrackerController {

    private WaterIntakeTrackerService waterIntakeTrackerService;

    @GetMapping
    public ResponseEntity<List<WaterIntakeTrackerResponse>> getAllWaterIntakeTrackerItems() {
        log.info(GET_CALL.getMessage());

        List<WaterIntakeTrackerResponse> responses = waterIntakeTrackerService.getAllWaterIntakeTrackerItems();

        log.info(WATERINTAKETRACKER_CREATED.getMessage(), responses);
        return new ResponseEntity<>(responses, HttpStatus.OK);
    }

    @PostMapping
    public void createWaterIntakeTracker(@RequestBody WaterIntakeTrackerRequest request) {

        log.info(POST_CALL.getMessage());

        waterIntakeTrackerService.createWaterIntakeTracker(request);

        log.info(WATERINTAKETRACKER_CREATED.getMessage(), request);
    }
}
