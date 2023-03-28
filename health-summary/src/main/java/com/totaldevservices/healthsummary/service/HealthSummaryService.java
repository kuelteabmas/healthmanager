package com.totaldevservices.healthsummary.service;

import com.totaldevservices.healthsummary.dto.HealthSummaryResponse;

import java.time.LocalDate;
import java.util.List;

public interface HealthSummaryService {

    HealthSummaryResponse getTotalHealthSummary();

    List<HealthSummaryResponse> getHealthSummaryByDateRange(LocalDate startDate,
                                                            LocalDate endDate);
}
