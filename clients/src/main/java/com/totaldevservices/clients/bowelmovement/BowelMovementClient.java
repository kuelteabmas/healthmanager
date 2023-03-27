package com.totaldevservices.clients.bowelmovement;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("bowelmovement")
public interface BowelMovementClient {

    @GetMapping(path = "api/v1/bowelmovements")
    List<BowelMovementResponse> getAllBowelMovements();
}
