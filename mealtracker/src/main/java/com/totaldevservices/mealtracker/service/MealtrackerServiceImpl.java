package com.totaldevservices.mealtracker.service;

import com.totaldevservices.mealtracker.MealTrackerRepository;
import com.totaldevservices.mealtracker.dto.MealTrackerRequest;
import com.totaldevservices.mealtracker.dto.MealtrackerResponse;
import com.totaldevservices.mealtracker.mapper.MealtrackerMapper;
import com.totaldevservices.mealtracker.model.Mealtracker;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class MealtrackerServiceImpl implements MealtrackerService {

    private final MealTrackerRepository mealTrackerRepository;
    private final MealtrackerMapper mealtrackerMapper;

    @Override
    public List<MealtrackerResponse> getAllMealtrackers() {
        List<MealtrackerResponse> mealtrackerResponses = mealTrackerRepository.findAll()
                .stream()
                .map(mealtrackerMapper)
                .collect(Collectors.toList());
        return mealtrackerResponses;
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
