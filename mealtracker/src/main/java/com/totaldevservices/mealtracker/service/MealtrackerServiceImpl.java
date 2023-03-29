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
import java.util.Optional;
import java.util.UUID;
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
    public MealtrackerResponse getMealtrackerById(UUID id) {
        Optional<Mealtracker> mealtrackerOptional = mealTrackerRepository.findById(id);

        // TODO: Throw Exception if ID doesn't exist in db

        MealtrackerResponse mealtrackerResponse = mealtrackerMapper.apply(mealtrackerOptional.get());
        return mealtrackerResponse;
    }

    @Override
    public MealtrackerResponse createTracker(MealTrackerRequest request) {

        Mealtracker mealtracker = Mealtracker.builder()
                .food(request.getFood())
                .localDateTimeOfMeal(LocalDateTime.now())
                .feltIll(request.isFeltIll())
                .illSymptoms(request.getIllSymptoms())
                .build();

        // todo: check if tracker is valid

        mealTrackerRepository.save(mealtracker);

        MealtrackerResponse mealtrackerResponse = mealtrackerMapper.apply(mealtracker);
        return mealtrackerResponse;
    }

    @Override
    public MealtrackerResponse updateMealtracker(MealTrackerRequest request) {
        Optional<Mealtracker> mealtrackerOptional = mealTrackerRepository.findById(request.getId());

        // TODO: Throw Exception if ID doesn't exist in db

        Mealtracker mealtracker = mealtrackerOptional.get();
        mealtracker.setFood(request.getFood());
        mealtracker.setFeltIll(request.isFeltIll());
        mealtracker.setIllSymptoms(request.getIllSymptoms());
        mealtracker.setLocalDateTimeOfMeal(LocalDateTime.now());

        mealTrackerRepository.save(mealtracker);

        MealtrackerResponse mealtrackerResponse = mealtrackerMapper.apply(mealtrackerOptional.get());
        return mealtrackerResponse;
    }

    @Override
    public void deleteMealtracker(UUID id) {
        Optional<Mealtracker> mealtrackerOptional = mealTrackerRepository.findById(id);

        // TODO: Throw Exception if ID doesn't exist in db

        mealTrackerRepository.delete(mealtrackerOptional.get());
    }
}
