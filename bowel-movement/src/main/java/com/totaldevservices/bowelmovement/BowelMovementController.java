package com.totaldevservices.bowelmovement;

import com.totaldevservices.bowelmovement.dto.BowelMovement;
import com.totaldevservices.bowelmovement.service.BowelMovementService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.totaldevservices.bowelmovement.enums.Constants.BOWELMOVEMENT_FETCHED;
import static com.totaldevservices.bowelmovement.enums.Constants.GET_CALL;

@Slf4j
@RestController
@RequestMapping("api/v1/bowelmovements")
@AllArgsConstructor
public class BowelMovementController {

    private BowelMovementService bmService;

    @GetMapping
    public List<BowelMovement> getAllBowelMovements() {
        log.info(GET_CALL.getMessage());
        List<BowelMovement> bmJournalItems = bmService.getAllBowelMovementJournalItems();
        log.info(BOWELMOVEMENT_FETCHED.getMessage(), bmJournalItems);

        return bmJournalItems;
    }
}
