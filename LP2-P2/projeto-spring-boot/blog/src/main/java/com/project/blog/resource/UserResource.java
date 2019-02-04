package com.project.blog.resource;

import java.net.URI;
import java.util.List;

import com.project.blog.domain.User;
import com.project.blog.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserResource {
    @Autowired
    UserRepository userRepository;


    // TOOD by ID
    @GetMapping("/user")
    public List<User> getAllUserByLocal() {
        return userRepository.findAll();
    }

    @PostMapping("/user")
    public ResponseEntity<User> createAddress(@RequestBody User user) {
        User userSaved = userRepository.save(user);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(userSaved.getId())
                .toUri();

        return ResponseEntity.created(uri).body(userSaved);
    }
}