package com.bbapi.movies_api.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bbapi.movies_api.entity.Review;
import com.bbapi.movies_api.entity.ReviewId;

@Repository
public interface ReviewRepository extends JpaRepository<Review, ReviewId> {

    @Query("SELECT r FROM Review r WHERE r.userId = :uid")
    public List<Review> findUID(@Param("uid") Long uid);

    @Query("SELECT r FROM Review r WHERE r.movieId = :mid")
    List<Review> findMID(@Param("mid") Long mid);
    
    @Query("SELECT r.movieId, AVG(r.rating) as AvgRating FROM Review r GROUP BY r.movieId ORDER BY AvgRating")
    List<Object[]>findTopRatings();
}
