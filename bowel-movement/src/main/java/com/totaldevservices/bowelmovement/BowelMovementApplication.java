package com.totaldevservices.bowelmovement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import static com.totaldevservices.TDSCommons.createDbIfNotExists;

@SpringBootApplication
@EnableEurekaClient
public class BowelMovementApplication {
    public static void main(String[] args) {
        createDbIfNotExists("bowelmovementdb", "5433");
        SpringApplication.run(BowelMovementApplication.class, args);
    }
}
