package com.research.restapidemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="cash_card")
public class CashCard {

    @Id
    private String cardId;
    private String cardName;
    private String cardAmount;

    @ManyToOne
    @JoinColumn(name = "family_id")
    private FamilyDetail familyId;
   
    // Empty Constructor Class
    public CashCard() {
    }

    public CashCard(String cardId, String cardName, String cardAmount, FamilyDetail familyId) {
        this.cardId = cardId;
        this.cardName = cardName;
        this.cardAmount = cardAmount;
    }

    // Getters
    public String getCardId() {
        return cardId;
    }
    public String getCardName() {
        return cardName;
    }
    public String getCardAmount() {
        return cardAmount;
    }
    public FamilyDetail getFamilyId() {
        return familyId;
    }
    
    // Setters
    public void setCardId(String cardId) {
        this.cardId = cardId;
    }
    public void setCardName(String cardName) {
        this.cardName = cardName;
    }
    public void setCardAmount(String cardAmount) {
        this.cardAmount = cardAmount;
    }
}

