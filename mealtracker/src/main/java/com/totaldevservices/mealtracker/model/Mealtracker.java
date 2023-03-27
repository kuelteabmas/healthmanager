package com.totaldevservices.mealtracker.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "mealtracker")
public class Mealtracker {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "mealtracker_id")
    private UUID id;

    private String food;

    @Column(name = "datetime")
    private LocalDateTime localDateTimeOfMeal;

    @Column(columnDefinition = "boolean default false")
    private boolean feltIll;

    private String illSymptoms;

}
