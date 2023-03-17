package com.totaldevservices.bowelmovement.dto;

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
@Table(name = "bowelmovement")
public class BowelMovement {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "bowelmovement_id")
    private UUID id;

    @Column(name = "datetime")
    private LocalDateTime localDateTimeOfBM;

    private String stoolNature;

    @Column(columnDefinition = "boolean default false")
    private boolean bloodInStool;

}
