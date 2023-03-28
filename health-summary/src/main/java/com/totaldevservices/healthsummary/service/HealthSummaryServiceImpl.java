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
import java.util.List;

@Service
@AllArgsConstructor
public class HealthSummaryServiceImpl implements HealthSummaryService {

//    private HealthSummaryRepository repository;
    private final MealtrackerClient mealtrackerClient;
    private final BowelMovementClient bowelMovementClient;
    private final WaterIntakeTrackerClient waterIntakeTrackerClient;

    public HealthSummaryResponse getTotalHealthSummary() {

            HealthSummaryResponse healthSummary = new HealthSummaryResponse();

            List<MealtrackerResponse> mealtrackerItems = mealtrackerClient.getAllMealtrackers();
            List<BowelMovementResponse> bmJournalItems = bowelMovementClient.getAllBowelMovements();
            List<WaterIntakeTrackerResponse> waterIntakeTrackerItems = waterIntakeTrackerClient.getAllWaterIntakeTrackerItems();

            // TODO: get the amount of water user drank, not the amount of times user drank

            healthSummary.setHealthSummaryCheckDate(LocalDate.now());
            healthSummary.setTotalMeals(mealtrackerItems.size());
            healthSummary.setTotalBowelMovements(bmJournalItems.size());
            healthSummary.setTotalAmountOfTimesDrinking(waterIntakeTrackerItems.size());

            return healthSummary;
    }

    // TODO: Needs rework
    @Override
    public List<HealthSummaryResponse> getHealthSummaryByDateRange(LocalDate startDate,
                                                                   LocalDate endDate) {

        List<HealthSummaryResponse> healthSummaryList = new ArrayList<>();

        List<MealtrackerResponse> mealtrackerItems = mealtrackerClient.getAllMealtrackers();
        List<BowelMovementResponse> bmJournalItems = bowelMovementClient.getAllBowelMovements();
        List<WaterIntakeTrackerResponse> waterIntakeTrackerItems = waterIntakeTrackerClient.getAllWaterIntakeTrackerItems();

        // TODO: get the amount of water user drank, not the amount of times user drank

        HealthSummaryResponse summary = new HealthSummaryResponse();
        summary.setHealthSummaryCheckDate(LocalDate.now());
        summary.setTotalMeals(mealtrackerItems.size());
        summary.setTotalBowelMovements(bmJournalItems.size());
        summary.setTotalAmountOfTimesDrinking(waterIntakeTrackerItems.size());

        healthSummaryList.add(summary);

        return healthSummaryList;
    }
}
