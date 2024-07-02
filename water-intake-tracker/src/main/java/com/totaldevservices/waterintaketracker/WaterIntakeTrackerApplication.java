package com.totaldevservices.waterintaketracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import static com.totaldevservices.TDSCommons.createDbIfNotExists;

@SpringBootApplication
@EnableEurekaClient
public class WaterIntakeTrackerApplication {
    public static void main(String[] args) {
        createDbIfNotExists("waterintaketrackerdb", "5434");
        SpringApplication.run(WaterIntakeTrackerApplication.class, args);
    }
}
