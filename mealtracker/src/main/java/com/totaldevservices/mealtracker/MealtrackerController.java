package com.totaldevservices.mealtracker;

import com.totaldevservices.mealtracker.dto.MealTrackerRequest;
import com.totaldevservices.mealtracker.dto.Mealtracker;
import com.totaldevservices.mealtracker.service.MealtrackerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.totaldevservices.mealtracker.enums.Constants.*;

@Slf4j
@RestController
@RequestMapping("api/v1/mealtrackers")
@AllArgsConstructor
public class MealtrackerController {

    private MealtrackerService mealtrackerService;

    @GetMapping
    public List<Mealtracker> getAllMealtrackers() {
        log.info(GET_CALL.getMessage());
        List<Mealtracker> mealtrackers = mealtrackerService.getAllMealtrackers();
        log.info(MEALTRACKER_FETCHED.getMessage(), mealtrackers);

        return mealtrackers;
    }

    @PostMapping
    public void createMealTracker(@RequestBody MealTrackerRequest mealTrackerRequest) {
        log.info(POST_CALL.getMessage());
        mealtrackerService.createTracker(mealTrackerRequest);
        log.info(MEALTRACKER_CREATED.getMessage(), mealTrackerRequest);
    }
}
