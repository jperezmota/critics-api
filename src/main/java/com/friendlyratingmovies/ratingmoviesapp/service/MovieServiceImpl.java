package com.friendlyratingmovies.ratingmoviesapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.friendlyratingmovies.ratingmoviesapp.entities.Movie;
import com.friendlyratingmovies.ratingmoviesapp.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {
	
	@Autowired
	private MovieRepository movieRepository;

	@Override
	public List<Movie> getMovies() {
		return (List<Movie>) movieRepository.findAll();
	}

	@Override
	public Movie getMovie(long id) {
		return movieRepository.findById(id).get();
	}

	@Override
	public Movie createMovie(Movie movie) {
		movie.setId(0);
		return movieRepository.save(movie);
	}

	@Override
	public void deleteMovie(Movie movie) {
		movieRepository.delete(movie);
	}

	@Override
	public Movie updateMovie(Movie movie) {
		return movieRepository.save(movie);
	}

}
