package com.totaldevservices.healthsummary.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HealthSummaryResponse {

    private UUID healthSummaryId;

    private LocalDate localDateTime;

    private int totalMeals;

    private int totalBowelMovements;

    private double totalWaterTook;
}
