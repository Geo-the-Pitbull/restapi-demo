package com.research.restapidemo.service.implement;

import java.util.List;

import org.springframework.stereotype.Service;

import com.research.restapidemo.model.CashCard;
import com.research.restapidemo.repository.CashCardRespository;
import com.research.restapidemo.service.CashCardService;

@Service
public class CashCardServiceImpl implements CashCardService{

    CashCardRespository cashCardRepository;
    public CashCardServiceImpl(CashCardRespository cashCardRepository) {
        this.cashCardRepository = cashCardRepository;
    }

    @Override
    public String createCashCard(CashCard cashCard) {
        cashCardRepository.save(cashCard);
        return "Successfully Created";
    }

    @Override
    public String updateCashCard(CashCard cashCard) {
        cashCardRepository.save(cashCard);
        return "Successfully Updated";
    }

    @Override
    public String deleteCashCard(String cashCardId) {
        cashCardRepository.deleteById(cashCardId);
        return "Successfully Deleted";
    }

    @Override
    public CashCard getCashCard(String cashCardId) {
        return cashCardRepository.findById(cashCardId).get();
    }

    @Override
    public List<CashCard> getAllCashCards() {
        return cashCardRepository.findAll();
    }
    
}
