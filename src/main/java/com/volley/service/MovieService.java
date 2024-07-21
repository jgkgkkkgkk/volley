package com.volley.service;

import com.volley.entities.Movie;
import com.volley.repo.MovieRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class MovieService {
    private final MovieRepo movieRepo;
    public List<Movie>getAllMovie(){
        return movieRepo.findAll();
    }
    public void createNewMovie(Movie movie){
        movieRepo.save(movie);
    }
}
