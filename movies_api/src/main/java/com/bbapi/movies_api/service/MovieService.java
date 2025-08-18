package com.bbapi.movies_api.service;

import java.util.List;

import com.bbapi.movies_api.entity.Movie;

public interface MovieService{
    
    List<Movie> getAllMovies();
    
    Movie getMovieById(Long id);

    Movie createMovie(Movie movie);

    Movie updateMovie(Long id, Movie movie);

    void deleteMovie(Long id);
}
