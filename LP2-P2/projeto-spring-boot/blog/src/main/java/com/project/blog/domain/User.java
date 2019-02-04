package com.project.blog.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class User{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id; 
    private String name;
    private String phone; 
    private String gender;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "local_id")
    private Local local; 
    
    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern="yyyy/MM/dd")
    private Date birthDate;

    // relationship
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<UserRentalPlan> userRentalPlans;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Score> scores;

    // constructor 
    public User(){}

    public User(String name, String phone, String gender){
        super();
        this.name = name;
        this.phone = phone;
        this.gender = gender; 
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getGender() {
        return gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Local getLocal() {
        return local;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}