package com.totaldevservices.bowelmovement;

import com.totaldevservices.bowelmovement.dto.BowelMovementResponse;
import com.totaldevservices.bowelmovement.service.BowelMovementService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<BowelMovementResponse>> getAllBowelMovements() {

        log.info(GET_CALL.getMessage());

        List<BowelMovementResponse> responses = bmService.getAllBowelMovementJournalItems();

        log.info(BOWELMOVEMENT_FETCHED.getMessage(), responses);
        return new ResponseEntity<>(responses, HttpStatus.OK);
    }
}
