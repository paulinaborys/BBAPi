package com.bbapi.movies_api.service;

import java.util.List;

import com.bbapi.movies_api.entity.Review;
import com.bbapi.movies_api.entity.ReviewId;

public interface ReviewService {
    
    public List<Review> getReviews();

    public List<Review> getUserReviews(Long uid);

    public List<Review> getMovieReviews(Long mid);

    public Review postReview(Review r);

    //public void deleteReview(Long reviewID);

    public void deleteReview(ReviewId reviewID);

}
