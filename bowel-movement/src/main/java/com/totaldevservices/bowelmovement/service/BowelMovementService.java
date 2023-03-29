package com.totaldevservices.bowelmovement.service;

import com.totaldevservices.bowelmovement.dto.BowelMovementRequest;
import com.totaldevservices.bowelmovement.dto.BowelMovementResponse;

import java.util.List;
import java.util.UUID;

public interface BowelMovementService {

    List<BowelMovementResponse> getAllBowelMovementJournalItems();

    BowelMovementResponse getBowelMovementJournalItemById(UUID id);

    BowelMovementResponse createBowelMovementJournalItem(BowelMovementRequest request);

    BowelMovementResponse updateBowelMovementJournalItem(BowelMovementRequest request);
}
