package com.totaldevservices.mealtracker.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

//@Entity
@Data
@Builder
public class Mealtracker {

    private UUID trackerId;

    private Meal meal;

    private LocalDateTime localDateTimeOfMeal;

    private boolean feltIll;

    private String illSymptoms;

}
