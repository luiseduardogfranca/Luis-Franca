package com.project.blog.repository;

import com.project.blog.domain.RentalPlan;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalPlanRepository extends JpaRepository<RentalPlan, Integer>{
    
}