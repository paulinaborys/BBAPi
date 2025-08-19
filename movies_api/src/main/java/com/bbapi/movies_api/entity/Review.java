package com.bbapi.movies_api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;


@Entity
@IdClass(ReviewId.class)
public class Review {

    @Id
    private Long  movieId;
    @Id
    private Long userId;
    private Double rating;

    public Review() {

    }

    public Review(Long movie_id,Long user_id, Double rating){
        this.movieId=movie_id; 
        this.userId=user_id;
        this.rating=rating;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Double getRating() {
        return rating;
    }

    public Long getMovieId() {
        return movieId;
    }

    public Long getUserId() {
        return userId;
    }


}