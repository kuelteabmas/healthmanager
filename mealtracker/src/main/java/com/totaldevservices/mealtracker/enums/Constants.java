package com.totaldevservices.mealtracker.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Constants {

    MEALTRACKER_CREATED("Meal Tracker created {}");

    private final String message;
}
