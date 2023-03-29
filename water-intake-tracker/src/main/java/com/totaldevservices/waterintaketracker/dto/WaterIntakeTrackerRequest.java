package com.totaldevservices.waterintaketracker.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class WaterIntakeTrackerRequest {
    private UUID id;
    private double amountOfWater;
    private String typeOfWater;
    private String waterEnhancement;
}
