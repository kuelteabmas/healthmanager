package com.totaldevservices.waterintaketracker;

import com.totaldevservices.waterintaketracker.dto.WaterIntakeTracker;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface WaterIntakeTrackerRepository extends JpaRepository<WaterIntakeTracker, UUID> {
}
