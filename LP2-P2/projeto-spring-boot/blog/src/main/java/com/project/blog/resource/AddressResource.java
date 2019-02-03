package com.project.blog.resource;

import java.util.List;

import com.project.blog.domain.Address;
import com.project.blog.repository.AddressRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressResource{
    @Autowired
    AddressRepository addressRepository;

    @GetMapping("/address")
    public List<Address> getAllAddress(){

        return addressRepository.findAll();
    }
}