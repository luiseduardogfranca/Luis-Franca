package com.project.blog;

import com.project.blog.repository.AddressRepository;
import com.project.blog.repository.LocalRepository;
import com.project.blog.repository.RentalPlanRepository;
import com.project.blog.repository.ScoreRepository;
import com.project.blog.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FacadeConfig{
    @Autowired
    UserRepository userRepository;

    @Autowired
    AddressRepository addressRepository;

    @Autowired
    LocalRepository localRepository;

    @Autowired
    RentalPlanRepository rentalPlanRepository;

    @Autowired
    ScoreRepository scoreRepository;

    @Bean
    public FacadeBlog getFacadeBlog(){
        System.out.println(userRepository);
        return new FacadeBlog(userRepository, addressRepository, localRepository, rentalPlanRepository, scoreRepository);
    }
}