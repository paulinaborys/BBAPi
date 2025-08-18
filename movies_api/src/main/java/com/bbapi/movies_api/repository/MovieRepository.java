package com.bbapi.movies_api.repository;

import org.springframework.stereotype.Repository;

import com.bbapi.movies_api.entity.Movie;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
    
}
