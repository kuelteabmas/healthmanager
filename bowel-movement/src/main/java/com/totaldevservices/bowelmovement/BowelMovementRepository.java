package com.totaldevservices.bowelmovement;

import com.totaldevservices.bowelmovement.dto.BowelMovement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BowelMovementRepository extends JpaRepository<BowelMovement, UUID> {
}
