package com.totaldevservices.mealtracker.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MealTrackerRequest {

    private Meal meal;

    private LocalDateTime localDateTimeOfMeal;

    private boolean feltIll;

    private String illSymptoms;

}
