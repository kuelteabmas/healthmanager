package com.totaldevservices.bowelmovement;

import com.totaldevservices.bowelmovement.dto.BowelMovementRequest;
import com.totaldevservices.bowelmovement.dto.BowelMovementResponse;
import com.totaldevservices.bowelmovement.service.BowelMovementService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.totaldevservices.bowelmovement.enums.Constants.*;

@Slf4j
@RestController
@RequestMapping("api/v1/bowelmovements")
@AllArgsConstructor
public class BowelMovementController {

    private BowelMovementService bmService;

    @GetMapping
    public ResponseEntity<List<BowelMovementResponse>> getAllBowelMovements() {

        log.info(GET_CALL.getMessage());

        List<BowelMovementResponse> responses = bmService.getAllBowelMovementJournalItems();

        log.info(BOWELMOVEMENT_FETCHED.getMessage(), responses);
        return new ResponseEntity<>(responses, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<BowelMovementResponse> createBowelMovementJournalItem(@RequestBody BowelMovementRequest request) {

        log.info(POST_CALL.getMessage());

        BowelMovementResponse response = bmService.createBowelMovementJournalItem(request);

        log.info(BOWELMOVEMENT_CREATED.getMessage(), request);
        return new ResponseEntity<>(response, HttpStatus.OK)
    }
}
