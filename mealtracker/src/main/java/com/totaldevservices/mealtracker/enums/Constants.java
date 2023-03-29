package com.totaldevservices.mealtracker.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Constants {

    MEALTRACKER_CREATED("Meal Tracker created {}"),
    MEALTRACKER_FETCHED("Meal Tracker fetched {}"),
    MEALTRACKER_UPDATED("Meal Tracker updated {}"),
    MEALTRACKER_DELETED("Meal Tracker deleted {}"),

    GET_CALL("Starting GET call"),
    POST_CALL("Starting POST call"),
    PUT_CALL("Starting PUT call"),
    DELETE_CALL("Starting DELETE call");

    private final String message;
}
