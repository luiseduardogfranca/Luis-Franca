package com.project.blog.repository;

import com.project.blog.domain.UserRentalPlan;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRentalPlanRepository extends JpaRepository<UserRentalPlan, Integer>{
    
}