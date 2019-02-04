package com.project.blog.resource;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import com.project.blog.domain.Local;
import com.project.blog.repository.LocalRepository;

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
public class LocalResource{
    @Autowired
    LocalRepository localRepository; 

    @GetMapping("/local")
    public List<Local> getAllLocal(){
        return localRepository.findAll();
    }

    @PostMapping("/local")
    public ResponseEntity<Local> createLocal(@RequestBody Local local){
        Local localSaved = localRepository.save(local);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(localSaved.getId()).toUri();

        return ResponseEntity.created(uri).body(localSaved);
    }

    @DeleteMapping("/local/{id}")
    public ResponseEntity deleteLocal(@PathVariable int id) {

        Optional<Local> local = localRepository.findById(id);

        if (local.isPresent()) {
            localRepository.deleteById(id);
        }

        return ResponseEntity.accepted().build();
    }
}