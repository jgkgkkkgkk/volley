package com.volley.controller;
import com.volley.entities.Movie;
import com.volley.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/movie")
public class MovieController {


    @Autowired
    private MovieService movieService;

    @PostMapping("/save")
    public void insertMovie(@RequestBody Movie movie) {
        movieService.createNewMovie(movie);;
    }

    @GetMapping("/list")
    public List<Movie> findAllMovie() {
        return movieService.getAllMovie();
    }

}
