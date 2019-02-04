package com.project.blog.resource;

import java.net.URI;
import java.util.List;

import com.project.blog.domain.UserRentalPlan;
import com.project.blog.repository.UserRentalPlanRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserRentalPlanResource {
    @Autowired
    UserRentalPlanRepository userRentalPlanRepository;

    @GetMapping("/rent")
    public List<UserRentalPlan> getAllUserRentalPlan() {
        return userRentalPlanRepository.findAll();
    }

    @PostMapping("/rent")
    public ResponseEntity<UserRentalPlan> createLocal(@RequestBody UserRentalPlan userRentalPlan) {
        UserRentalPlan userRentalPlanSaved = userRentalPlanRepository.save(userRentalPlan);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(userRentalPlanSaved.getId())
                .toUri();

        return ResponseEntity.created(uri).body(userRentalPlanSaved);
    }
}