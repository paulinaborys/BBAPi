package com.bbapi.movies_api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bbapi.movies_api.entity.Movie;
import com.bbapi.movies_api.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {
   
    private MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }


    @Override
    public Movie getMovieById(Long id) {
        return movieRepository.findById(id).orElse(null);
    }

    @Override
    public Movie createMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public Movie updateMovie(Long id, Movie movie) {
        Movie m=movieRepository.findById(id).orElse(null);
        m.setCast(movie.getCast());
        m.setDirector(movie.getDirector());
        m.setTitle(movie.getTitle());
        m.setGenre(movie.getGenre());
        return m;
    }

    @Override
    public void deleteMovie(Long id) {
        movieRepository.deleteById(id);
    }
}
