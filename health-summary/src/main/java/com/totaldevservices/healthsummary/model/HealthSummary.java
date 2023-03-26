package com.totaldevservices.healthsummary.model;

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
@Table
public class HealthSummary {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "health_summary_id")
    private UUID id;

    @Column(name = "datetime")
    private LocalDateTime localDateTime;

    @Column(name = "total_meals_for_day")
    private int totalMeals;

    @Column(name = "total_bmovements_for_day")
    private int totalBowelMovements;

    @Column(name = "total_water_for_day")
    private double totalWaterTook;
}
