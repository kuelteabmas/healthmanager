package com.totaldevservices.healthsummary.service;

import com.totaldevservices.clients.bowelmovement.BowelMovementClient;
import com.totaldevservices.clients.bowelmovement.BowelMovementResponse;
import com.totaldevservices.clients.mealtracker.MealtrackerClient;
import com.totaldevservices.clients.mealtracker.MealtrackerResponse;
import com.totaldevservices.clients.waterintaketracker.WaterIntakeTrackerClient;
import com.totaldevservices.clients.waterintaketracker.WaterIntakeTrackerResponse;
import com.totaldevservices.healthsummary.dto.HealthSummaryResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class HealthSummaryServiceImpl implements HealthSummaryService {

    private final MealtrackerClient mealtrackerClient;
    private final BowelMovementClient bowelMovementClient;
    private final WaterIntakeTrackerClient waterIntakeTrackerClient;

    // NOTE:
    // Before saving to database, need to refactor service method to first check db for data in expected response
    // before making http calls to other microservice and saving duplicate data
    public HealthSummaryResponse getTotalHealthSummary() {

            HealthSummaryResponse healthSummaryResponse = new HealthSummaryResponse();

            List<MealtrackerResponse> mealtrackerItems = mealtrackerClient.getAllMealtrackers();
            List<BowelMovementResponse> bmJournalItems = bowelMovementClient.getAllBowelMovements();
            List<WaterIntakeTrackerResponse> waterIntakeTrackerItems = waterIntakeTrackerClient.getAllWaterIntakeTrackerItems();

            // TODO: get the amount of water user drank, not the amount of times user drank

            healthSummaryResponse.setHealthSummaryCheckDate(LocalDate.now());
            healthSummaryResponse.setTotalMeals(mealtrackerItems.size());
            healthSummaryResponse.setTotalBowelMovements(bmJournalItems.size());
            healthSummaryResponse.setTotalAmountOfTimesDrinking(waterIntakeTrackerItems.size());

            return healthSummaryResponse;
    }

    // TODO: Needs rework
    @Override
    public List<HealthSummaryResponse> getHealthSummaryByDateRange(LocalDate startDate,
                                                                   LocalDate endDate) {

        List<HealthSummaryResponse> summaryResponses = new ArrayList<>();

        List<MealtrackerResponse> mealtrackerItems = mealtrackerClient.getAllMealtrackers();
        List<BowelMovementResponse> bmJournalItems = bowelMovementClient.getAllBowelMovements();
        List<WaterIntakeTrackerResponse> waterIntakeTrackerItems = waterIntakeTrackerClient.getAllWaterIntakeTrackerItems();

        // TODO: get the amount of water user drank, not the amount of times user drank

        // check how many days between startDate and endDate
        // for each day and each list, add to HealthSummary obj data that corresponds to matching day

        Map<LocalDate, List<MealtrackerResponse>> mealtrackerItemsByDateMap = mealtrackerItems.stream()
                .collect(Collectors.groupingBy(mealtrackerItem -> mealtrackerItem.getLocalDateTimeOfMeal().toLocalDate()));

        Map<LocalDate, List<BowelMovementResponse>> bmJournalItemsByDateMap = bmJournalItems.stream()
                .collect(Collectors.groupingBy((bmJournalItem -> bmJournalItem.getLocalDateTimeOfBM().toLocalDate())));

        Map<LocalDate, List<WaterIntakeTrackerResponse>> waterIntakeTrackerItemsByDateMap = waterIntakeTrackerItems.stream()
                .collect(Collectors.groupingBy(waterIntakeTrackerItem -> waterIntakeTrackerItem.getLocalDateTimeOfWaterIntake().toLocalDate()));

        for (LocalDate date = startDate; !date.isAfter(endDate); date = date.plusDays(1)) {
            HealthSummaryResponse summaryResponse = new HealthSummaryResponse();

            summaryResponse.setHealthSummaryCheckDate(date);

            List<MealtrackerResponse> mealtrackerResponses = mealtrackerItemsByDateMap.getOrDefault(date, Collections.emptyList());
            summaryResponse.setTotalMeals(mealtrackerResponses.size());

            List<BowelMovementResponse> bowelMovementResponses = bmJournalItemsByDateMap.getOrDefault(date, Collections.emptyList());
            summaryResponse.setTotalBowelMovements(bowelMovementResponses.size());

            List<WaterIntakeTrackerResponse> waterIntakeTrackerResponses =
                    waterIntakeTrackerItemsByDateMap.getOrDefault(date, Collections.emptyList());
            summaryResponse.setTotalAmountOfTimesDrinking(waterIntakeTrackerResponses.size());

            summaryResponses.add(summaryResponse);
        }

        return summaryResponses;
    }
}
