package com.totaldevservices.mealtracker;

import com.totaldevservices.mealtracker.dto.MealTrackerRequest;
import com.totaldevservices.mealtracker.service.MealtrackerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.totaldevservices.mealtracker.enums.Constants.MEALTRACKER_CREATED;

@Slf4j
@RestController
@RequestMapping("api/v1/mealtracker")
public class MealtrackerController {

    private MealtrackerService mealtrackerService;

    @PostMapping
    public void createMealTracker(@RequestBody MealTrackerRequest mealTrackerRequest) {
        log.info(MEALTRACKER_CREATED.getMessage(), mealTrackerRequest);
        mealtrackerService.createTracker(mealTrackerRequest);
    }

    @GetMapping
    public void getAllTrackingEvents() {

    }
}
