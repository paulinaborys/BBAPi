package com.bbapi.movies_api.entity;

import org.springframework.stereotype.Indexed;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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

    
}
