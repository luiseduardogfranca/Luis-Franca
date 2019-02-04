package com.project.blog.resource;

import java.net.URI;
import java.util.List;

import com.project.blog.domain.Score;
import com.project.blog.repository.ScoreRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class ScoreResource {
    @Autowired
    ScoreRepository scoreRepository;

    // TODO get by ID user 
    @GetMapping("/score")
    public List<Score> getScoreByUser() {
        return scoreRepository.findAll();
    }

    @PostMapping("/score")
    public ResponseEntity<Score> createLocal(@RequestBody Score score) {
        Score scoreSaved = scoreRepository.save(score);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(scoreSaved.getId()).toUri();

        return ResponseEntity.created(uri).body(scoreSaved);
    }

    
}