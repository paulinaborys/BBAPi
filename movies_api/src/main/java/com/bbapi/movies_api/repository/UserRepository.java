package com.bbapi.movies_api.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.bbapi.movies_api.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}
