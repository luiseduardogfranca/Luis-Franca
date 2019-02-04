package com.project.blog.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Score{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private int score;
    private int amountRent; 

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id")
    private User user; 

    public Score(){}

    public Score(int score, int amountRent){
        setAmountRent(amountRent);
        setScore(score);
    }

    public Integer getId() {
        return id;
    }

    public int getAmountRent() {
        return amountRent;
    }

    public int getScore() {
        return score;
    }

    public User getUser() {
        return user;
    }

    public void setAmountRent(int amountRent) {
        if(amountRent >= 0){
            this.amountRent = amountRent;
        }
    }

    public void setScore(int score) {
        if(score >= 0){
            this.score = score;
        }
    }
}