package com.totaldevservices.mealtracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import static com.totaldevservices.TDSCommons.createDbIfNotExists;

@SpringBootApplication
@EnableEurekaClient
public class MealtrackerApplication {
    public static void main(String[] args) {
        createDbIfNotExists("mealtrackerdb", "5432");
        SpringApplication.run(MealtrackerApplication.class, args);
    }
}
