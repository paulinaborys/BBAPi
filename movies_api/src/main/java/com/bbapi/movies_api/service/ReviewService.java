package com.bbapi.movies_api.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.data.jpa.repository.Query;

import com.bbapi.movies_api.entity.Review;

@Service
public interface ReviewService {
    
    public List<Review> getReviews();

    public List<Review> getUserReviews(Long uid);

    public List<Review> getMovieReviews(Long mid);

    public Review postReview(Review r);

    public void deleteReview(Long reviewID);

}
