package com.totaldevservices.clients.waterintaketracker;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("waterintaketracker")
public interface WaterIntakeTrackerClient {

    @GetMapping(path = "api/v1/waterintaketrackers")
    List<WaterIntakeTrackerResponse> getAllWaterIntakeTrackerItems();
}
