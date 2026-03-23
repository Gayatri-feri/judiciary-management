package com.judiciary.judiciary_management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.judiciary.judiciary_management.entity.Case;
import com.judiciary.judiciary_management.repository.CaseRepository;

@Service
public class CaseService {

    @Autowired
    private CaseRepository repository;

    // Get all cases
    public List<Case> getAllCases() {
        return repository.findAll();
    }

    // Save case
    public Case saveCase(Case c) {
        return repository.save(c);
    }
}