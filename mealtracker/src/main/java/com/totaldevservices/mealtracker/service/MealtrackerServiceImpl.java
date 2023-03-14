package com.totaldevservices.mealtracker.service;

import com.totaldevservices.mealtracker.MealTrackerRepository;
import com.totaldevservices.mealtracker.dto.MealTrackerRequest;
import com.totaldevservices.mealtracker.dto.Mealtracker;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class MealtrackerServiceImpl implements MealtrackerService {

    private final MealTrackerRepository mealTrackerRepository;

    @Override
    public List<Mealtracker> getAllMealtrackers() {
        List<Mealtracker> mealtrackers = mealTrackerRepository.findAll();
        return mealtrackers;
    }

    @Override
    public void createTracker(MealTrackerRequest request) {

        Mealtracker mealtracker = Mealtracker.builder()
                .food(request.getFood())
                .localDateTimeOfMeal(LocalDateTime.now())
                .feltIll(request.isFeltIll())
                .illSymptoms(request.getIllSymptoms())
                .build();

        // todo: check if tracker is valid

        mealTrackerRepository.save(mealtracker);
    }
}
