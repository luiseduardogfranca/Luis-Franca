package com.project.blog.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class UserRentalPlan{
    
    public static String STATUS_OPEN = "open";
    public static String STATUS_CLOSED = "closed";
    public static String STATUS_CANCELED = "canceled";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date rentDate;
    private int amountRent; 
    private String status; 

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;  

    @ManyToOne
    @JoinColumn(name = "rental_plan_id")
    private RentalPlan rentalPlan; 

    public UserRentalPlan(){}

    public UserRentalPlan(Date date, int amountRent, RentalPlan rentalPlan, User user){
        this.rentDate = date; 
        this.amountRent = amountRent;
        this.rentalPlan = rentalPlan;
        this.user = user;
        this.status = STATUS_OPEN;
    }

    public Integer getId() {
        return id;
    }
    
    public int getAmountRent() {
        return amountRent;
    }

    public Date getRentDate() {
        return rentDate;
    }

    public String getStatus() {
        return status;
    }

    public void setAmountRent(int amountRent) {
        this.amountRent = amountRent;
    }

    public void setRentDate(Date rentDate) {
        this.rentDate = rentDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}