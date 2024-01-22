package com.research.restapidemo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.research.restapidemo.model.CashCard;
import com.research.restapidemo.response.ResponseHandler;
import com.research.restapidemo.service.CashCardService;

@RestController
@RequestMapping("/cashcard")
public class CashCardController {

    CashCardService cashCardService;
    public CashCardController(CashCardService cashCardService) {
        this.cashCardService = cashCardService;
    }
    
    // Get a Cash Card
    @GetMapping("{cardId}")
    public ResponseEntity<Object> getCashCardDetails(@PathVariable("cardId") String cardId) {
       return ResponseHandler.responseBuilder("The Cash Card Details", HttpStatus.OK,cashCardService.getCashCard(cardId));
    }
    // Get All Cash Cards
    @GetMapping()
    public List<CashCard> getAllCashCards() {
        return cashCardService.getAllCashCards();
    }
    
    @PostMapping
    public String createCashCardDetails(@RequestBody CashCard cashCard) {
        cashCardService.createCashCard(cashCard);
        return "Cash Card Created Successfully";
    }

    @PutMapping
    public String updateCashCardDetails(@RequestBody CashCard cashCard) {
        cashCardService.updateCashCard(cashCard);
        return "Cash Card Updated Successfully";
    }

    @DeleteMapping("{cardId}")
    public String deleteCashCardDetails(@PathVariable("cardId") String cardId) {
        cashCardService.deleteCashCard(cardId);
        return "Cash Card Deleted Successfully";
    }
}
