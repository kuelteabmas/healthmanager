package com.totaldevservices.bowelmovement.mapper;

import com.totaldevservices.bowelmovement.dto.BowelMovementResponse;
import com.totaldevservices.bowelmovement.model.BowelMovement;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class BowelMovementMapper implements Function<BowelMovement, BowelMovementResponse> {

    @Override
    public BowelMovementResponse apply(BowelMovement bowelMovement) {
        return new BowelMovementResponse(
                bowelMovement.getId(),
                bowelMovement.getLocalDateTimeOfBM(),
                bowelMovement.getStoolNature(),
                bowelMovement.isBloodInStool()
        );
    }
}
