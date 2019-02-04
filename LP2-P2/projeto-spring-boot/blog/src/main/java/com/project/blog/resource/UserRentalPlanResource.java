package com.project.blog.resource;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import com.project.blog.domain.UserRentalPlan;
import com.project.blog.repository.UserRentalPlanRepository;

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
public class UserRentalPlanResource {
    @Autowired
    UserRentalPlanRepository userRentalPlanRepository;

    @GetMapping("/rent")
    public List<UserRentalPlan> getAllRent() {
        return userRentalPlanRepository.findAll();
    }

    @PostMapping("/rent")
    public ResponseEntity<UserRentalPlan> createRent(@RequestBody UserRentalPlan userRentalPlan) {
        UserRentalPlan userRentalPlanSaved = userRentalPlanRepository.save(userRentalPlan);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(userRentalPlanSaved.getId())
                .toUri();

        return ResponseEntity.created(uri).body(userRentalPlanSaved);
    }

    @DeleteMapping("/rent/{id}")
    public ResponseEntity deleteRente(@PathVariable int id) {

        Optional<UserRentalPlan> rentalPlan = userRentalPlanRepository.findById(id);

        if (rentalPlan.isPresent()) {
            userRentalPlanRepository.deleteById(id);
        }

        return ResponseEntity.accepted().build();
    }
}