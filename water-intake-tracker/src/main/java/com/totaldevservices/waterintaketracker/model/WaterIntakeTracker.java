package com.totaldevservices.waterintaketracker.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
@Table(name = "waterintaketracker")
public class WaterIntakeTracker {
    /**
     * time and day
     *
     * amount (in milliliters and oz)
     *
     * type of water (spring, tap-filtered, tap water, purified drinking, alkaline)
     *
     * added water enhancements (ie: lemons, flavoring, vitamins, etc)
     */

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "waterintaketracker_id")
    private UUID id;

    @Column(name = "amount_of_water")
    private double amountOfWater;

    @Column(name = "datetime")
    private LocalDateTime localDateTimeOfWaterIntake;

    @Column(name = "type_of_water")
    private String typeOfWater;

    @Column(name = "water_enhancement")
    private String waterEnhancement;
}
