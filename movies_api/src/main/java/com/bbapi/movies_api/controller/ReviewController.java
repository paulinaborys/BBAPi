package com.bbapi.movies_api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bbapi.movies_api.entity.Review;
import com.bbapi.movies_api.service.ReviewService;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



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
    
    @GetMapping("/m{id}")
    public List<Review> getMovieReviews(@PathVariable Long movieID) {
        return this.rs.getMovieReviews(movieID);
    }

    @GetMapping("/u{id}}")
    public List<Review> getUserReviews(@PathVariable Long userID) {
        return this.rs.getUserReviews(userID);
    }
    
    @PostMapping()
    public Review postReview(@RequestBody Review entity) {
        
        return this.rs.postReview(entity);
    }

    @DeleteMapping("/{id}")
    public void deleteReview(@PathVariable Long uID){
        this.rs.deleteReview(uID);
    }
    
    
    

    

}
