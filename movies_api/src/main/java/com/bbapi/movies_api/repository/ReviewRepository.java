package com.bbapi.movies_api.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bbapi.movies_api.entity.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {

    // @Query("SELECT r FROM Review r WHERE r.uid = :uid;")
    // public List<Review> findUID(Long uid);

    // @Query("SELECT r FROM Review r WHERE r.mid = :mid;")
    // public List<Review> findMID(Long mid);
    
}
