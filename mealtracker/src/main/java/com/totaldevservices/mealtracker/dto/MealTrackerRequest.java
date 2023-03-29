package com.totaldevservices.mealtracker.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class MealTrackerRequest {
//    private Meal meal;
    private UUID id;
    private String food;
    private boolean feltIll;
    private String illSymptoms;
}
