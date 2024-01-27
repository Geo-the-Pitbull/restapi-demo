package com.research.restapidemo.service;

import java.util.List;

import com.research.restapidemo.model.FamilyDetail;

public interface FamilyDetailService {
    
    public String createFamilyDetail(FamilyDetail familyDetail);
    public String updateFamilyDetail(FamilyDetail familyDetail);
    public String deleteFamilyDetail(String familyDetailId);
    public FamilyDetail getFamilyDetail(String familyDetailId);
    public List<FamilyDetail> getAllFamilyDetails();
}
