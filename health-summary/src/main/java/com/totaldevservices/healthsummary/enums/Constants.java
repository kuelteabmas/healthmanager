package com.totaldevservices.healthsummary.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Constants {

    HEALTH_SUMMARY_CREATED("Health Summary created {}"),
    HEALTH_SUMMARY_FETCHED("Health Summary fetched {}"),

    GET_CALL("Starting GET call"),
    POST_CALL("Starting POST call");

    private final String message;
}
