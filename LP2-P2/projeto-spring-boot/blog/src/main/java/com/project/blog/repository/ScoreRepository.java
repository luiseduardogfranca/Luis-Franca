package com.project.blog.repository;

import com.project.blog.domain.Score;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, Integer>{
    
}