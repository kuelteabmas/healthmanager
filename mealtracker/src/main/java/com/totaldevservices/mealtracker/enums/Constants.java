package com.totaldevservices.mealtracker.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Constants {

    MEALTRACKER_CREATED("Meal Tracker created {}"),
    MEALTRACKER_FETCHED("Meal Tracker fetched {}"),

    GET_CALL("Starting GET call"),
    POST_CALL("Starting POST call");

    private final String message;
}
