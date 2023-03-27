package com.totaldevservices.mealtracker.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Meal {

    private String food;
    private String drink;
}
