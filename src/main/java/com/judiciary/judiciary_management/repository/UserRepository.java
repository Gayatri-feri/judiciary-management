package com.judiciary.judiciary_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.judiciary.judiciary_management.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}