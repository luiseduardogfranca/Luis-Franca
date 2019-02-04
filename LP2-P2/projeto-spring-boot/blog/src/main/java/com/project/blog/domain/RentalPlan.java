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
public class RentalPlan{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;
    private String description; 
    private double price;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "local_id")
    private Local local;

    @OneToMany(mappedBy = "rentalPlan", cascade = CascadeType.ALL)
    private List<UserRentalPlan> userRentalPlans;
    public RentalPlan(){}

    public RentalPlan(String title, String description, double price){
        this.title = title;
        this.description = description;
        setPrice(price);
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public Integer getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public Local getLocal() {
        return local;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        if(price >= 0){
            this.price = price;
        }
    }

    public void setTitle(String title) {
        this.title = title;
    }
}