package com.friendlyratingmovies.ratingmoviesapp.service;


import com.friendlyratingmovies.ratingmoviesapp.entities.Movie;

public interface MovieService {
	public Iterable<Movie> getMovies();
	public Movie getMovie(long id);
	public Movie createMovie(Movie movie);
	public void deleteMovie(Movie movie);
	public Movie updateMovie(Movie movie);
}
