package com.totaldevservices.mealtracker;

import com.totaldevservices.mealtracker.dto.MealTrackerRequest;
import com.totaldevservices.mealtracker.dto.MealtrackerResponse;
import com.totaldevservices.mealtracker.service.MealtrackerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

import static com.totaldevservices.mealtracker.enums.Constants.*;

@Slf4j
@RestController
@RequestMapping("api/v1/mealtrackers")
@AllArgsConstructor
public class MealtrackerController {

    private MealtrackerService mealtrackerService;

    @GetMapping
    public ResponseEntity<List<MealtrackerResponse>> getAllMealtrackers() {
        log.info(GET_CALL.getMessage());

        List<MealtrackerResponse> responses = mealtrackerService.getAllMealtrackers();

        log.info(MEALTRACKER_FETCHED.getMessage(), responses);
        return new ResponseEntity<>(responses, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MealtrackerResponse> getMealtrackerById(@PathVariable UUID id) {
        log.info(GET_CALL.getMessage());

        MealtrackerResponse response = mealtrackerService.getMealtrackerById(id);

        log.info(MEALTRACKER_FETCHED.getMessage(), response);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<MealtrackerResponse> createMealTracker(@RequestBody MealTrackerRequest request) {
        log.info(POST_CALL.getMessage());

        MealtrackerResponse response = mealtrackerService.createTracker(request);

        log.info(MEALTRACKER_CREATED.getMessage(), response);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
