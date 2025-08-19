package com.bbapi.movies_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bbapi.movies_api.entity.Review;
import com.bbapi.movies_api.entity.ReviewId;
import com.bbapi.movies_api.repository.ReviewRepository;

@Service
public class ReviewServiceImpl implements ReviewService {
    @Autowired
    private ReviewRepository reviewRepo;

    @Override
    public List<Review> getReviews() {
        // TODO Auto-generated method stub
        return reviewRepo.findAll();
    }

    @Override
    public List<Review> getUserReviews(Long uid) {
        // TODO Auto-generated method stub
        //SELECT * FROM REVIEWS where uid={uid};
        return reviewRepo.findUID(uid);
    }

    @Override
    public List<Review> getMovieReviews(Long mid) {
        // TODO Auto-generated method stub
        return reviewRepo.findMID(mid);
    }

    @Override
    public Review postReview(Review r) {
        // TODO Auto-generated method stub
        return reviewRepo.save(r);
    }

    @Override
    public void deleteReview(ReviewId reviewID) {
        // TODO Auto-generated method stub
        reviewRepo.deleteById(reviewID);
    }

    @Override
    public List<Object[]> getTopRatings() {
        return reviewRepo.findTopRatings();
    }
    
}
