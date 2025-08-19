package com.bbapi.movies_api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bbapi.movies_api.entity.Review;
import com.bbapi.movies_api.entity.ReviewId;
import com.bbapi.movies_api.service.ReviewService;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
@RequestMapping("/reviews")
public class ReviewController {
    
    private final ReviewService rs;

    ReviewController(ReviewService rs){
        this.rs=rs;
    }

    @GetMapping()
    public List<Review> getReviews() {
        return this.rs.getReviews();
    }
    
    @GetMapping("/movie/{id}")
    public List<Review> getMovieReviews(@PathVariable Long id) {
        return this.rs.getMovieReviews(id);
    }

    @GetMapping("/user/{id}")
    public List<Review> getUserReviews(@PathVariable Long id) {
        return this.rs.getUserReviews(id);
    }
    
    @PostMapping()
    public Review postReview(@RequestBody Review entity) {
        
        return this.rs.postReview(entity);
    }

    @DeleteMapping("/{id}")
    public void deleteReview(@PathVariable ReviewId id){
        this.rs.deleteReview(id);
    }
    // findTopRatings
    @GetMapping("/top-ratings")
    public List<Object[]> getTopRatings() {
        return rs.getTopRatings();
    }

    @GetMapping("/top-ratings/{genre}")
    public List<Object[]> getTopRatingsByGenre(@PathVariable String genre) {
        return rs.getTopRatingsByGenre(genre);
    }
    
    

}
