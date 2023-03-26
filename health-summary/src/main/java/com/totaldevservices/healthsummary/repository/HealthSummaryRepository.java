package com.totaldevservices.healthsummary.repository;

import com.totaldevservices.healthsummary.model.HealthSummary;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public interface HealthSummaryRepository extends JpaRepository<HealthSummary, UUID> {

    List<HealthSummary> findAllByDateBetween(LocalDate startDate,
                                             LocalDate endDate);
}
