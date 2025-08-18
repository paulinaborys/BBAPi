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

    private final Integer  movie_id;
    private final Integer user_id;
    private final Double rating;

    public Review(Integer movie_id,Integer user_id, Double rating){
        this.movie_id=movie_id;
        this.user_id=user_id;
        this.rating=rating;
    }

    
}
