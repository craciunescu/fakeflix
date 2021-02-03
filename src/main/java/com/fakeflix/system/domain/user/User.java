package com.fakeflix.system.domain.user;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity @Data @Table(name = "USERS") 
public class User implements RatingService {

    // Fields
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int userID;

    @Column(name = "USERNAME", nullable = false)
    private String userName;

    @OneToMany(mappedBy = "USERS")
    private List<Viewer> views;

    @OneToMany(mappedBy = "USERS")
    private List<Rating> ratings;

    @Override
    public void addRating(Rating rating) {
        // TODO Auto-generated method stub

    }

    @Override
    public List<Rating> getRatings() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int getAverageRating() {
        // TODO Auto-generated method stub
        return 0;
    }

}
