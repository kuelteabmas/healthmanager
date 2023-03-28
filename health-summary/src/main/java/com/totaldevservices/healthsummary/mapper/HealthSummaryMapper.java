package com.totaldevservices.healthsummary.mapper;

import com.totaldevservices.healthsummary.dto.HealthSummaryResponse;
import com.totaldevservices.healthsummary.model.HealthSummary;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.function.Function;

@Service
public class HealthSummaryMapper implements Function<HealthSummary, HealthSummaryResponse> {
    @Override
    public HealthSummaryResponse apply(HealthSummary healthSummary) {
        return new HealthSummaryResponse(
                healthSummary.getId(),
                null,
                healthSummary.getTotalMeals(),
                healthSummary.getTotalBowelMovements(),
                healthSummary.getTotalAmountOfTimesDrinking(),
                0
        );
    }
}
