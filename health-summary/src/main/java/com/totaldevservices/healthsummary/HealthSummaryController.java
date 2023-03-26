package com.totaldevservices.healthsummary;

import com.totaldevservices.healthsummary.dto.HealthSummaryResponse;
import com.totaldevservices.healthsummary.service.HealthSummaryService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

import static com.totaldevservices.healthsummary.enums.Constants.GET_CALL;
import static com.totaldevservices.healthsummary.enums.Constants.HEALTH_SUMMARY_FETCHED;

@RestController
@RequestMapping("api/v1/health-summary")
@AllArgsConstructor
@Slf4j
public class HealthSummaryController {

    private HealthSummaryService healthSummaryService;

    @GetMapping
    public ResponseEntity<List<HealthSummaryResponse>> getHealthSummaryByDateRange(
            @RequestParam("startDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
            @RequestParam("endDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate) {

        log.info(GET_CALL.getMessage());

        List<HealthSummaryResponse> healthSummaryResponses = healthSummaryService.getHealthSummaryByDateRange(startDate, endDate);

        log.info(HEALTH_SUMMARY_FETCHED.getMessage());

        return new ResponseEntity<>(healthSummaryResponses, HttpStatus.OK);
    }
}
