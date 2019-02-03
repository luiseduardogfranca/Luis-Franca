package com.project.blog;

import java.util.List;

import com.project.blog.domain.Address;
import com.project.blog.domain.Local;
import com.project.blog.domain.RentalPlan;
import com.project.blog.domain.Score;
import com.project.blog.domain.User;
import com.project.blog.repository.AddressRepository;
import com.project.blog.repository.LocalRepository;
import com.project.blog.repository.RentalPlanRepository;
import com.project.blog.repository.ScoreRepository;
import com.project.blog.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FacadeBlog{

    // instances for repository
    UserRepository userRepository; 
    AddressRepository addressRepository; 
    LocalRepository localRepository;
    RentalPlanRepository rentalPlanRepository;
    ScoreRepository scoreRepository;

    public FacadeBlog(UserRepository userRepository, AddressRepository addressRepository, LocalRepository localRepository,
        RentalPlanRepository rentalPlanRepository, ScoreRepository scoreRepository){
            this.userRepository = userRepository;
            this.addressRepository = addressRepository; 
            this.localRepository = localRepository; 
            this.rentalPlanRepository = rentalPlanRepository; 
            this.scoreRepository = scoreRepository;
        }
    
    // CRUD address 
    public List<Address> readAllAddress(){
        return addressRepository.findAll();
    }

    public void createAddress(Address address){
        addressRepository.save(address);
    }

    public void deleteAddress(int id){
        addressRepository.deleteById(id);
    }

    // CRUD local
    public void createLocal(Local local){
        localRepository.save(local);
    }

    public void deleteLocal(int id){
        localRepository.deleteById(id);
    }

    // CRUD rental_plan 
    public void createRentalPlan(RentalPlan rentalPlan){
        rentalPlanRepository.save(rentalPlan);
    }

    public void deleteRentalPlan(int id){
        rentalPlanRepository.deleteById(id);
    }

    // CRUD user 
    public void createUser(User user){
        // verifications... TODO

        userRepository.save(user);
    }

    public void deleteUser(int id){
        userRepository.deleteById(id);
    }

    // CRUD score
    public void createScore(Score score){
        scoreRepository.save(score);
    }

    public void editScore(Score score){
        scoreRepository.save(score);
    }

    public void deleteScore(int id){
        scoreRepository.deleteById(id);
    }


}