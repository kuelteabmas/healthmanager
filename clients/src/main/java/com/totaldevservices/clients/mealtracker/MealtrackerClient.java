package com.totaldevservices.clients.mealtracker;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("mealtracker")
public interface MealtrackerClient {

    @GetMapping(path = "api/v1/mealtrackers")
    List<MealtrackerResponse> getAllMealtrackers();
}
