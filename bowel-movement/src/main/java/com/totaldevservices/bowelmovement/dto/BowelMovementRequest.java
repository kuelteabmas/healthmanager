package com.totaldevservices.bowelmovement.dto;

import lombok.Data;

@Data
public class BowelMovementRequest {
    private String stoolNature;
    private boolean bloodInStool;
}
