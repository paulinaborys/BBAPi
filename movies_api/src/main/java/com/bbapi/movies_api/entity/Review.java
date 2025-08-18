package com.bbapi.movies_api.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;


@Entity
@IdClass(ReviewId.class)
public class Review {

    @Id
    private final Long  movieId;
    @Id
    private final Long userId;
    private final Double rating;

    public Review() {
        this.movieId = null;
        this.userId = null;
        this.rating = null;
    }

    public Review(Long movie_id,Long user_id, Double rating){
        this.movieId=movie_id;
        this.userId=user_id;
        this.rating=rating;
    }

    public Long getMovie_id() {
        return movieId;
    }

    public Long getUser_id() {
        return userId;
    }

    public Double getRating() {
        return rating;
    }


}