package com.totaldevservices.mealtracker.dto;

import lombok.Data;

@Data
public class MealTrackerRequest {
//    private Meal meal;
    private String food;
    private boolean feltIll;
    private String illSymptoms;
}
