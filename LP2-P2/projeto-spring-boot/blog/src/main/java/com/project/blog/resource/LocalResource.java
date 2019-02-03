package com.project.blog.resource;

import java.util.List;

import com.project.blog.domain.Local;
import com.project.blog.repository.LocalRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocalResource{
    @Autowired
    LocalRepository localRepository; 

    @GetMapping("/local")
    public List<Local> getAllLocal(){
        return localRepository.findAll();
    }
}