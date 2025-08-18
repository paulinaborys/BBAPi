package com.bbapi.movies_api.entity;

import java.io.Serializable;

import com.bbapi.movies_api.entity.Review.ReviewId;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;


@Entity
@IdClass(ReviewId.class)
public class Review {

    @Id
    private final Long  movie_id;
    @Id
    private final Long user_id;
    private final Double rating;

    public Review(Long movie_id,Long user_id, Double rating){
        this.movie_id=movie_id;
        this.user_id=user_id;
        this.rating=rating;
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

    public class ReviewId implements Serializable {
        private Long userId;
        private Long movieId;

    
        public ReviewId() {}
        public ReviewId(Long userId, Long movieId) {
            this.userId = userId;
            this.movieId = movieId;
        }
        
    }
}