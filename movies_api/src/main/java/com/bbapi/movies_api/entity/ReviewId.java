package com.bbapi.movies_api.entity;

import java.io.Serializable;

public class ReviewId implements Serializable {
    private Long userId;
    private Long movieId;

    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public Long getMovieId() {
        return movieId;
    }
    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }
    
    public ReviewId() {}
    public ReviewId(Long userId, Long movieId) {
        this.userId = userId;
        this.movieId = movieId;
    }
    
}
