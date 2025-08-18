package com.bbapi.movies_api.service;

import java.util.List;

<<<<<<< HEAD
import org.springframework.stereotype.Service;

=======
>>>>>>> bf565e7a10e9623e9b26f350d5bd6a4e0f2bde59
import com.bbapi.movies_api.entity.Review;

public interface ReviewService {
    
    public List<Review> getReviews();

    public List<Review> getUserReviews(Long uid);

    public List<Review> getMovieReviews(Long mid);

    public Review postReview(Review r);

    public void deleteReview(Long reviewID);

}
