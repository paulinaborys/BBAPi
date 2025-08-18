package com.bbapi.movies_api.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.bbapi.movies_api.entity.Cinephile;
import com.bbapi.movies_api.repository.CinephileRepository;

@Service
public class CinephileServiceImpl implements CinephileService {

    private CinephileRepository cinephileRepository;

    private Logger logger = LoggerFactory.getLogger(CinephileServiceImpl.class);
   
    public CinephileServiceImpl(CinephileRepository cinephileRepository) {
        this.cinephileRepository = cinephileRepository;
    }

    @Override
    public List<Cinephile> getAllCinephiles() {
        logger.info("getAllCinephiles()=");
        List<Cinephile> cinephiles = cinephileRepository.findAll();
        logger.info(cinephiles.toString());
        return cinephiles;
    }

    @Override
    public Cinephile getCinephileById(Long id) {
        return cinephileRepository.findById(id)
        .orElseThrow();
    }

    @Override
    public Cinephile createCinephile(Cinephile cinephile) {
        return cinephileRepository.save(cinephile);
    }

    @Override
    public void deleteCinephile(Long id) {
        cinephileRepository.deleteById(id);
    }
    
}
