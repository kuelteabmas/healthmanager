package com.totaldevservices.mealtracker.dto;

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
public class MealtrackerResponse {

    private UUID id;
    private String food;
    private LocalDateTime localDateTimeOfMeal;
    private boolean feltIll;
    private String illSymptoms;
}
