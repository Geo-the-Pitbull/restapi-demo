package com.research.restapidemo.service.implement;

import java.util.List;

import org.springframework.stereotype.Service;

import com.research.restapidemo.exception.FamilyDetailNotFoundException;
import com.research.restapidemo.model.FamilyDetail;
import com.research.restapidemo.repository.FamilyDetailRepository;
import com.research.restapidemo.service.FamilyDetailService;

@Service
public class FamilyDetailServiceImpl implements FamilyDetailService  {
    
    private final FamilyDetailRepository familyDetailRepository;
    public FamilyDetailServiceImpl(FamilyDetailRepository familyDetailRepository) {
        this.familyDetailRepository =familyDetailRepository;
    }

    @Override
    public String createFamilyDetail(FamilyDetail familyDetail) {
        familyDetailRepository.save(familyDetail);
        return "Successfully Created";
    }

    @Override
    public String updateFamilyDetail(FamilyDetail familyDetail) {
        familyDetailRepository.save(familyDetail);
        return "Successfully Updated";
    }

    @Override
    public String deleteFamilyDetail(String familyDetailId) {
        familyDetailRepository.deleteById(familyDetailId);
        return "Successfully Deleted";
    }

    @Override
    public FamilyDetail getFamilyDetail(String familyDetailId) {
        if(familyDetailRepository.findById(familyDetailId).isEmpty())
            throw new FamilyDetailNotFoundException("Requested Family Detail does not exist");
        return familyDetailRepository.findById(familyDetailId).get();
    }

    @Override
    public List<FamilyDetail> getAllFamilyDetails() {
        return familyDetailRepository.findAll();
    }
}
