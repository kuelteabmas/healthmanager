package com.totaldevservices.bowelmovement.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Constants {

    BOWELMOVEMENT_CREATED("Bowel Movement journal item created {}"),
    BOWELMOVEMENT_FETCHED("Bowel Movement journal items fetched {}"),

    GET_CALL("Starting GET call"),
    POST_CALL("Starting POST call");

    private final String message;
}