package com.project.blog.resource;

import java.util.List;

import com.project.blog.domain.Score;
import com.project.blog.repository.ScoreRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScoreResource {
    @Autowired
    ScoreRepository scoreRepository;

    // TODO get by ID user 
    @GetMapping("/score")
    public List<Score> getScoreByUser() {
        return scoreRepository.findAll();
    }
}