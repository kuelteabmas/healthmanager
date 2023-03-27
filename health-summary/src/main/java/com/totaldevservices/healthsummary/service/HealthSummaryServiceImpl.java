package com.totaldevservices.healthsummary.service;

import com.totaldevservices.clients.mealtracker.MealtrackerClient;
import com.totaldevservices.clients.mealtracker.MealtrackerResponse;
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

    @Override
    public List<HealthSummaryResponse> getHealthSummaryByDateRange(LocalDate startDate,
                                                                   LocalDate endDate) {

        List<HealthSummaryResponse> healthSummaryList = new ArrayList<>();

        // TODO: fetch number of Meals
        List<MealtrackerResponse> mealtrackerItems = mealtrackerClient.getAllMealtrackers();

        // TODO: fetch number of Bowel Movements

        // TODO: fetch number of Water intakes

        HealthSummaryResponse summary = new HealthSummaryResponse();
        summary.setTotalMeals(mealtrackerItems.size());

        healthSummaryList.add(summary);


        return healthSummaryList;
    }
}
