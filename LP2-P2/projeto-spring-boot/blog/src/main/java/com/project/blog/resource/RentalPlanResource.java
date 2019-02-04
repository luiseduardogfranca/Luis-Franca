package com.project.blog.resource;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import com.project.blog.domain.RentalPlan;
import com.project.blog.repository.RentalPlanRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class RentalPlanResource{
    @Autowired
    RentalPlanRepository rentalPlanRepository; 

    // TOOD get by id Local
    @GetMapping("/rental_plan")
    public List<RentalPlan> getAllRentalPlanByLocal(){
        return rentalPlanRepository.findAll();
    }

    @PostMapping("/rental_plan")
    public ResponseEntity<RentalPlan> createAddress(@RequestBody RentalPlan rentalPlan) {
        RentalPlan rentalPlanSaved = rentalPlanRepository.save(rentalPlan);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(rentalPlanSaved.getId())
                .toUri();

        return ResponseEntity.created(uri).body(rentalPlanSaved);
    }

    @DeleteMapping("/rental_plan/{id}")
    public ResponseEntity deleteAddress(@PathVariable int id) {

        Optional<RentalPlan> rentalPlan = rentalPlanRepository.findById(id);

        if (rentalPlan.isPresent()) {
            rentalPlanRepository.deleteById(id);
        }

        return ResponseEntity.accepted().build();
    }
}