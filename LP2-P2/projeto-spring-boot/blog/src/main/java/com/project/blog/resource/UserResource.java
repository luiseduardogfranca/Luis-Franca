package com.project.blog.resource;

import java.util.List;

import com.project.blog.domain.User;
import com.project.blog.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {
    @Autowired
    UserRepository userRepository;


    // TOOD by ID
    @GetMapping("/user")
    public List<User> getAllUserByLocal() {
        return userRepository.findAll();
    }
}