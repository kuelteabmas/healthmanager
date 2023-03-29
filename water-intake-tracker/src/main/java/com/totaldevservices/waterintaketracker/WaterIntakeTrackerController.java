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
import java.util.UUID;

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

        log.info(WATERINTAKETRACKER_FETCHED.getMessage(), responses);
        return new ResponseEntity<>(responses, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<WaterIntakeTrackerResponse> getWaterIntakeTrackerItemById(@PathVariable UUID id) {
        log.info(GET_CALL.getMessage());

        WaterIntakeTrackerResponse response = waterIntakeTrackerService.getWaterIntakeTrackerItemById(id);

        log.info(WATERINTAKETRACKER_FETCHED.getMessage(), response);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<WaterIntakeTrackerResponse> createWaterIntakeTracker(@RequestBody WaterIntakeTrackerRequest request) {

        log.info(POST_CALL.getMessage());

        WaterIntakeTrackerResponse response = waterIntakeTrackerService.createWaterIntakeTracker(request);

        log.info(WATERINTAKETRACKER_CREATED.getMessage(), response);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<WaterIntakeTrackerResponse> updateWaterIntakeTracker(@RequestBody WaterIntakeTrackerRequest request) {

        log.info(PUT_CALL.getMessage());

        WaterIntakeTrackerResponse response = waterIntakeTrackerService.updateWaterIntakeTracker(request);

        log.info(WATERINTAKETRACKER_UPDATED.getMessage(), response);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteWaterIntakeTracker(@PathVariable UUID id) {

        log.info(DELETE_CALL.getMessage());

        waterIntakeTrackerService.deleteWaterIntakeTracker(id);

        log.info(WATERINTAKETRACKER_DELETED.getMessage());
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
