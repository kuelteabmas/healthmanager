package com.totaldevservices.waterintaketracker.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Constants {

    WATERINTAKETRACKER_CREATED("Water Intake Tracker created {}"),
    WATERINTAKETRACKER_FETCHED("Water Intake Tracker fetched {}"),

    GET_CALL("Starting GET call"),
    POST_CALL("Starting POST call");

    private final String message;
}
