package com.totaldevservices.bowelmovement.service;

import com.totaldevservices.bowelmovement.BowelMovementRepository;
import com.totaldevservices.bowelmovement.dto.BowelMovement;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BowelMovementServiceImpl implements BowelMovementService {

    private BowelMovementRepository repository;

    @Override
    public List<BowelMovement> getAllBowelMovementJournalItems() {
        List<BowelMovement> bmJournalItems = repository.findAll();
        return bmJournalItems;
    }
}
