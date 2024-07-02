package com.totaldevservices.healthsummary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import static com.totaldevservices.TDSCommons.createDbIfNotExists;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(
        basePackages = "com.totaldevservices.clients"
)
public class HealthSummaryApplication {
    public static void main(String[] args) {
        createDbIfNotExists("healthsummarydb", "5431");
        SpringApplication.run(HealthSummaryApplication.class, args);
    }
}
