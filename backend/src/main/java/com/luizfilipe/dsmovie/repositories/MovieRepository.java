package com.luizfilipe.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luizfilipe.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
