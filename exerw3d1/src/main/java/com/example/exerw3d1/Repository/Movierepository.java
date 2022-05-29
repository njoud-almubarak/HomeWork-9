package com.example.exerw3d1.Repository;

import com.example.exerw3d1.model.Movie;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Movierepository extends JpaRepository<Movie,Integer> {
}
