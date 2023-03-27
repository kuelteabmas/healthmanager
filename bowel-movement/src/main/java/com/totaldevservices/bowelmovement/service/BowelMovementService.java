package com.totaldevservices.bowelmovement.service;

import com.totaldevservices.bowelmovement.dto.BowelMovementResponse;

import java.util.List;

public interface BowelMovementService {

    List<BowelMovementResponse> getAllBowelMovementJournalItems();
}
