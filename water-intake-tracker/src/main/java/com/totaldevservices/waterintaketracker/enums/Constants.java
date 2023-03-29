package com.totaldevservices.waterintaketracker.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Constants {

    WATERINTAKETRACKER_CREATED("Water Intake Tracker created {}"),
    WATERINTAKETRACKER_FETCHED("Water Intake Tracker fetched {}"),
    WATERINTAKETRACKER_UPDATED("Water Intake Tracker updated {}"),
    WATERINTAKETRACKER_DELETED("Water Intake Tracker deleted {}"),

    GET_CALL("Starting GET call"),
    POST_CALL("Starting POST call"),
    PUT_CALL("Starting PUT call"),
    DELETE_CALL("Starting DELETE call");

    private final String message;
}
