package com.bbapi.movies_api.entity;

import java.io.Serializable;

public class ReviewId implements Serializable {
    private Long userId;
    private Long movieId;


    public ReviewId() {}
    public ReviewId(Long userId, Long movieId) {
        this.userId = userId;
        this.movieId = movieId;
    }
    
}
