package com.research.restapidemo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name ="family_details")
public class FamilyDetail {

    @Id
    private String familyId;
    private String familyName;
    private String noOfPersons;
    private String location;

    @OneToMany(mappedBy = "family_id", cascade = CascadeType.ALL)
    private List<CashCard> cashCard;

    // Empty Constructor Class
    public FamilyDetail(){
    }

    public FamilyDetail(String familyId, String familyName, String noOfPersons, String location, List<CashCard> cashCard) {
        this.familyId = familyId;
        this.familyName = familyName;
        this.noOfPersons = noOfPersons;
        this.location = location;
        this.cashCard = cashCard;
    }

    // Getters
    public String getFamilyId() {
        return familyId;
    }
    public String getFamilyName() {
        return familyName;
    }
    public String getNoOfPersons() {
        return noOfPersons;
    }
    public String getLocation() {
        return location;
    }
    public List<CashCard> getcashCards() {
        return cashCard;
    }
    

    // Setters
    public void setFamilyId(String familyId) {
        this.familyId = familyId;
    }
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }
    public void setNoOfPersons(String noOfPersons) {
        this.noOfPersons = noOfPersons;
    }
    public void setLocation(String location) {
        this.location =location;
    }
}
