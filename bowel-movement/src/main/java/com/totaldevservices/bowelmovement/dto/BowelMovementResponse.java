package com.totaldevservices.bowelmovement.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BowelMovementResponse {

    private UUID id;
    private LocalDateTime localDateTimeOfBM;
    private String stoolNature;
    private boolean bloodInStool;
}
