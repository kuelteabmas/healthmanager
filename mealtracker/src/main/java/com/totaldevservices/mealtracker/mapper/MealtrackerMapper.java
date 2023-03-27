package com.totaldevservices.mealtracker.mapper;

import com.totaldevservices.mealtracker.dto.MealtrackerResponse;
import com.totaldevservices.mealtracker.model.Mealtracker;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class MealtrackerMapper implements Function<Mealtracker, MealtrackerResponse> {

    @Override
    public MealtrackerResponse apply(Mealtracker mealtracker) {
        return new MealtrackerResponse(
                mealtracker.getId(),
                mealtracker.getFood(),
                mealtracker.getLocalDateTimeOfMeal(),
                mealtracker.isFeltIll(),
                mealtracker.getIllSymptoms()
        );
    }
}
