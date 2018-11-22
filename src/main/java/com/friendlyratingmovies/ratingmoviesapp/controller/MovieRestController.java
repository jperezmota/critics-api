package com.friendlyratingmovies.ratingmoviesapp.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.friendlyratingmovies.ratingmoviesapp.entities.Movie;

@RestController
@RequestMapping("/api")
public class MovieRestController {
	
	@GetMapping("/movies")
	public List<Movie> getPerspectives(){
		Movie movie = new Movie();
		movie.setId(1);
		movie.setTitle("Venmom");
		List<Movie> ar = new ArrayList();
		ar.add(movie);
		
		return ar;
	}

}
