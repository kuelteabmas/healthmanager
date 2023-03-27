package com.totaldevservices.bowelmovement.service;

import com.totaldevservices.bowelmovement.BowelMovementRepository;
import com.totaldevservices.bowelmovement.dto.BowelMovementResponse;
import com.totaldevservices.bowelmovement.mapper.BowelMovementMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class BowelMovementServiceImpl implements BowelMovementService {

    private BowelMovementRepository repository;
    private BowelMovementMapper bowelMovementMapper;

    @Override
    public List<BowelMovementResponse> getAllBowelMovementJournalItems() {
        List<BowelMovementResponse> bmJournalItemsResponses = repository.findAll()
                .stream()
                .map(bowelMovementMapper)
                .collect(Collectors.toList());

        return bmJournalItemsResponses;
    }
}
