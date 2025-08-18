package com.bbapi.movies_api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bbapi.movies_api.entity.Cinephile;
import com.bbapi.movies_api.service.CinephileService;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/cinephiles")
public class CinephileController {
    private final CinephileService cinephileService;

    public CinephileController(CinephileService cinephileService) {
        this.cinephileService = cinephileService;
    }

    @GetMapping
    public ResponseEntity<List<Cinephile>> getAllCinephiles() {
        return ResponseEntity.ok(cinephileService.getAllCinephiles());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cinephile> getCinephileById(@RequestParam Long id) {
        return ResponseEntity.ok(cinephileService.getCinephileById(id));
    }

    @PostMapping()
    public ResponseEntity<Cinephile> addCinephile(@RequestBody Cinephile cinephile) {
        return ResponseEntity.ok(cinephileService.createCinephile(cinephile));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCinephile(@PathVariable Long id){
        cinephileService.deleteCinephile(id);
        return ResponseEntity.noContent().build();
    }
    
    
    
    
}
