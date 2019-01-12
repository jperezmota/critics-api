package com.friendlyratingmovies.ratingmoviesapp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.friendlyratingmovies.ratingmoviesapp.entities.Movie;
import com.friendlyratingmovies.ratingmoviesapp.service.MovieService;

@RestController
@RequestMapping("/api")
public class MovieRestController {
	
	@Autowired
	private MovieService movieService;
	
	@GetMapping("/movies")
	public Iterable<Movie> getPerspectives(){
		return movieService.getMovies();
	}
	
	@GetMapping("/movies/{id}")
	public Movie getMovie(@PathVariable("id") long id) {
		return movieService.getMovie(id);
	}
	
	@PostMapping("/movies")
	public Movie createMovie(@RequestBody Movie movie) {
		return movieService.createMovie(movie);
	}
	
	@DeleteMapping("/movies/{id}")
	public void deleteMovie(@PathVariable long id) {
		Movie movie = movieService.getMovie(id);
		movieService.deleteMovie(movie);
	}
	
	@PatchMapping("/movies/{id}")
	public Movie updateMovie(@RequestBody Movie movie) {
		return movieService.updateMovie(movie);
	}

}
