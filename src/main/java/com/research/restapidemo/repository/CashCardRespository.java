package com.research.restapidemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.research.restapidemo.model.CashCard;

public interface CashCardRespository extends JpaRepository<CashCard, String> {
    
}
