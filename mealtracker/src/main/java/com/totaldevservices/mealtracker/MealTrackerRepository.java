package com.totaldevservices.mealtracker;

import com.totaldevservices.mealtracker.dto.Mealtracker;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MealTrackerRepository extends JpaRepository<Mealtracker, UUID> {
}
