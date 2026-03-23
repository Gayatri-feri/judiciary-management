package com.judiciary.judiciary_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.judiciary.judiciary_management.entity.Case;

@Repository
public interface CaseRepository extends JpaRepository<Case, Long> {

}