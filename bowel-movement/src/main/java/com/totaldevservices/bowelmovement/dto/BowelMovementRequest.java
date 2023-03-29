package com.totaldevservices.bowelmovement.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class BowelMovementRequest {
    private UUID id;
    private String stoolNature;
    private boolean bloodInStool;
}
