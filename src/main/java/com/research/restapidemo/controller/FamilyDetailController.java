package com.research.restapidemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.research.restapidemo.model.FamilyDetail;
import com.research.restapidemo.response.ResponseHandler;
import com.research.restapidemo.service.FamilyDetailService;

@RestController
@RequestMapping("/familydetail")
@CrossOrigin(origins = "*/*", maxAge = 3600)
public class FamilyDetailController {
    
    FamilyDetailService familyDetailService;
    public FamilyDetailController(FamilyDetailService familyDetailService) {
        this.familyDetailService = familyDetailService;
    }

    // Get a Family Detail
    @GetMapping("{familyId}")
    public ResponseEntity<Object> getFamilyDetail(@PathVariable("familyId") String familyId) {
        return ResponseHandler.responseBuilder("The Details of this Family", HttpStatus.OK,familyDetailService.getFamilyDetail(familyId));
    }

    // Get All Family Details
    @GetMapping()
    public ResponseEntity<Object> getAllFamilyDetails() {
        return ResponseHandler.responseBuilder("The Details of All Families", HttpStatus.OK,familyDetailService.getAllFamilyDetails());
    }

    // Create a Family Detail
    @PostMapping
    public String createFamilyDetails(@RequestBody FamilyDetail familyDetail) {
        familyDetailService.createFamilyDetail(familyDetail);
        return "Family Detail Created Successfully";
    }

    // Update a Family Detail
    @PutMapping
    public String updateFamilyDetails(@RequestBody FamilyDetail familyDetail) {
        familyDetailService.updateFamilyDetail(familyDetail);
        return "Family Detail Updated Successfully";
    }

    // Delete a Family Detail
    @DeleteMapping("{familyId}")
    public String deleteFamilyDetails(@PathVariable("familyId") String familyId) {
        familyDetailService.deleteFamilyDetail(familyId);
        return "Family Detail Deleted Successfully";
    }
}
