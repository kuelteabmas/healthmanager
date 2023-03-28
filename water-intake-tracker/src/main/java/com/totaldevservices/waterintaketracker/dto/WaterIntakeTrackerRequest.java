package com.totaldevservices.waterintaketracker.dto;

import lombok.Data;

@Data
public class WaterIntakeTrackerRequest {
    private double amountOfWater;
    private String typeOfWater;
    private String waterEnhancement;
}
