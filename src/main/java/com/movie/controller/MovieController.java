package com.movie.controller;


import com.movie.dtos.Movie;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pick")
@RequiredArgsConstructor
public class MovieController {

    @Value("${custom.property.app.one}")
    private String customAppValueOne;

    @GetMapping("/movies")
    public List<Movie> getMovies() {

        Movie m1 = new Movie(12L, "movie-name-1");
        Movie m2 = new Movie(13L, "movie-name-2");
        Movie m3 = new Movie(14L, "movie-name-3");
        Movie m4 = new Movie(14L, "movie-name-4");
        Movie m5 = new Movie(14L, "movie-name-45");

        return List.of(m1, m2, m3, m4, m5);
    }

    @GetMapping("/app/value")
    public List<String> getAppValue() {
        return List.of(customAppValueOne);
    }

}
