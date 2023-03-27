package com.totaldevservices.clients.waterintaketracker;

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
public class WaterIntakeTrackerResponse {

    private UUID id;
    private double amountOfWater;
    private LocalDateTime localDateTimeOfWaterIntake;
    private String typeOfWater;
    private String waterEnhancement;
}
