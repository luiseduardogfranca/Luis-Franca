package com.project.blog.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Address{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; 

    private String city; 
    private String state;
    private String street; 
    private String neighborhood; 
    private String latitude; 
    private String longitude; 
    private String cep; 
    private String number;

    @OneToMany(mappedBy = "address", cascade = CascadeType.ALL)
    private List<Local> local;

    public Address(){}

    public Address(String city, String state, String neighborhood,
        String latitude, String longitude, String cep, String number){
            this.city = city; 
            this.state = state; 
            this.neighborhood = neighborhood;
            this.latitude = latitude;
            this.longitude = longitude;            
            this.cep = cep;
            this.number = number;
    }
    
    public Integer getId() {
        return id;
    }

    public String getCep() {
        return cep;
    }

    public String getCity() {
        return city;
    }
    
    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }
    
    public String getNeighborhood() {
        return neighborhood;
    }

    public String getNumber() {
        return number;
    }

    public String getState() {
        return state;
    }

    public String getStreet() {
        return street;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
    
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setStreet(String street) {
        this.street = street;
    }

}