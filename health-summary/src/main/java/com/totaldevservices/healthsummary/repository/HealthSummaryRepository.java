package com.totaldevservices.healthsummary.repository;

import com.totaldevservices.healthsummary.model.HealthSummary;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface HealthSummaryRepository extends JpaRepository<HealthSummary, UUID> {

//    List<HealthSummary> findByColumnDateBetween(LocalDate startDate,
//                                             LocalDate endDate);
}
