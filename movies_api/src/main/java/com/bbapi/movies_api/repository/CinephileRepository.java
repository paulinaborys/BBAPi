package com.bbapi.movies_api.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.bbapi.movies_api.entity.Cinephile;

@Repository
public interface CinephileRepository extends JpaRepository<Cinephile, Long> {
    
}
