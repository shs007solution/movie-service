package com.movie.controller;


import com.movie.dtos.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pick")
public class MovieController {

    @GetMapping("/movies")
    public List<Movie> getMovies() {

        Movie m1 = new Movie(12L, "movie-name-1");
        Movie m2 = new Movie(13L, "movie-name-2");
        Movie m3 = new Movie(14L, "movie-name-3");

        return List.of(m1, m2, m3);
    }
}
