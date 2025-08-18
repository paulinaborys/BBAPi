package com.bbapi.movies_api.service;

import java.util.List;

import com.bbapi.movies_api.entity.Cinephile;

public interface CinephileService {
    
    public List<Cinephile> getAllCinephiles();
    public Cinephile getCinephileById(Long id);
    public Cinephile createCinephile(Cinephile cinephile);
    public void deleteCinephile(Long id);
}
