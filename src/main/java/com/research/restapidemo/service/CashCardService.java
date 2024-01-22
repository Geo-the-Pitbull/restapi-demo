package com.research.restapidemo.service;

import java.util.List;

import com.research.restapidemo.model.CashCard;

public interface CashCardService {
    
    public String createCashCard(CashCard cashCard);
    public String updateCashCard(CashCard cashCard);
    public String deleteCashCard(String cashCardId);
    public CashCard getCashCard(String cashCardId);
    public List<CashCard> getAllCashCards();
}
