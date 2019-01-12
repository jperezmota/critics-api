package com.friendlyratingmovies.ratingmoviesapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.friendlyratingmovies.ratingmoviesapp.entities.Movie;

public interface MovieRepository extends CrudRepository<Movie, Long>{

}
