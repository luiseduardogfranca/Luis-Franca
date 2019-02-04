package com.project.blog.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Local{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    private double totalGain; 
    private double expectedGain;

    private String description; 

    // relationship

    @ManyToOne(optional = false)
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToMany(mappedBy = "local", cascade = CascadeType.ALL)
    private List<User> users; 

    @OneToMany(mappedBy = "local", cascade = CascadeType.ALL)
    private List<RentalPlan> rentalPlans;
 
    public Local(){}

    public Local(double totalGain, double gainFuture, String description){
        super();
        this.description = description;
        this.totalGain = totalGain;
        this.expectedGain = gainFuture;
    }

    public String getDescription() {
        return description;
    }

    public double getExpectedGain() {
        return expectedGain;
    }

    public Integer getId() {
        return id;
    }

    public double getTotalGain() {
        return totalGain;
    }

    public Address getAddress() {
        return address;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setExpectedGain(double expectedGain) {
        this.expectedGain = expectedGain;
    }

    public void setTotalGain(double totalGain) {
        this.totalGain = totalGain;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}