package com.totaldevservices.bowelmovement.service;

import com.totaldevservices.bowelmovement.BowelMovementRepository;
import com.totaldevservices.bowelmovement.dto.BowelMovementRequest;
import com.totaldevservices.bowelmovement.dto.BowelMovementResponse;
import com.totaldevservices.bowelmovement.mapper.BowelMovementMapper;
import com.totaldevservices.bowelmovement.model.BowelMovement;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
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

    @Override
    public BowelMovementResponse getBowelMovementJournalItemById(UUID id) {
        Optional<BowelMovement> bowelMovementOptional = repository.findById(id);

        // TODO: Throw Exception if ID doesn't exist in db

        BowelMovementResponse response = bowelMovementMapper.apply(bowelMovementOptional.get());
        return response;
    }

    @Override
    public BowelMovementResponse createBowelMovementJournalItem(BowelMovementRequest request) {
        BowelMovement bmJournalItem = new BowelMovement().builder()
                .localDateTimeOfBM(LocalDateTime.now())
                .stoolNature(request.getStoolNature())
                .bloodInStool(request.isBloodInStool())
                .build();

        repository.save(bmJournalItem);

        BowelMovementResponse response = bowelMovementMapper.apply(bmJournalItem);
        return response;
    }

    @Override
    public BowelMovementResponse updateBowelMovementJournalItem(BowelMovementRequest request) {
        Optional<BowelMovement> bowelMovementOptional = repository.findById(request.getId());

        // TODO: Throw Exception if ID doesn't exist in db

        BowelMovement bowelMovement = bowelMovementOptional.get();
        bowelMovement.setBloodInStool(request.isBloodInStool());
        bowelMovement.setStoolNature(request.getStoolNature());
        bowelMovement.setLocalDateTimeOfBM(LocalDateTime.now());

        repository.save(bowelMovement);

        BowelMovementResponse bowelMovementResponse = bowelMovementMapper.apply(bowelMovementOptional.get());
        return bowelMovementResponse;
    }
}
