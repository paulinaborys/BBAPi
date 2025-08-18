package com.bbapi.movies_api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class Review {

    @Id
    @GeneratedValue
    private Long Id;

    private final Long  movie_id;
    private final Long user_id;
    private final Double rating;

    public Review(Long movie_id,Long user_id, Double rating){
        this.movie_id=movie_id;
        this.user_id=user_id;
        this.rating=rating;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Long getMovie_id() {
        return movie_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public Double getRating() {
        return rating;
    }

    
}
