package com.totaldevservices.healthsummary.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HealthSummaryDTO {

    private UUID healthSummaryId;

    private LocalDateTime localDateTime;

    private int totalMeals;

    private int totalBowelMovements;

    private double totalWaterTook;
}
