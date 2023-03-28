package com.totaldevservices.healthsummary.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class HealthSummaryResponse {

    private UUID id;
    private LocalDate healthSummaryCheckDate;
    private int totalMeals;
    private int totalBowelMovements;
    private double totalWaterTook;
    private int totalAmountOfTimesDrinking;
}
