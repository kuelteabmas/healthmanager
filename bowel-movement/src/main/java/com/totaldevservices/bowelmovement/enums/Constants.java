package com.totaldevservices.bowelmovement.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Constants {

    BOWELMOVEMENT_CREATED("Bowel Movement journal item created {}"),
    BOWELMOVEMENT_FETCHED("Bowel Movement journal item fetched {}"),
    BOWELMOVEMENT_UPDATED("Bowel Movement journal item updated {}"),

    GET_CALL("Starting GET call"),
    POST_CALL("Starting POST call"),
    PUT_CALL("Starting PUT call");

    private final String message;
}