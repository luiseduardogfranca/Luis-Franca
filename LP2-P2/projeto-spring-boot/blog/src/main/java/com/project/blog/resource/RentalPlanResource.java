package com.project.blog.resource;

import java.util.List;

import com.project.blog.domain.RentalPlan;
import com.project.blog.repository.RentalPlanRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RentalPlanResource{
    @Autowired
    RentalPlanRepository rentalPlanRepository; 

    // TOOD get by id Local
    @GetMapping("/rental_plan")
    public List<RentalPlan> getAllRentalPlanByLocal(){
        return rentalPlanRepository.findAll();
    }
}