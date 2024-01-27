package com.research.restapidemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.research.restapidemo.model.FamilyDetail;

public interface FamilyDetailRepository extends JpaRepository<FamilyDetail, String> {
    
}
