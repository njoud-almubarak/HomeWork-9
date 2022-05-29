package com.example.exerw3d1.services;

import com.example.exerw3d1.Repository.Movierepository;
import com.example.exerw3d1.model.Movie;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.List;


@Service
@RequiredArgsConstructor
public class Movieservices {

    private final Movierepository movierepository;
    private final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
    public List<Movie> getmovie(){
        return movierepository.findAll();
    }

    public void addmovie(Movie movie){
        movierepository.save(movie);
    }

    public void updatemovie(Integer id, Movie movie){

        Movie oldmovie =movierepository.findById(id).get();
        oldmovie.setId(id);
        oldmovie.setName(movie.getName());
        oldmovie.setGenre(movie.getGenre());
        oldmovie.setRating(movie.getRating());
        oldmovie.setDuration(movie.getDuration());
        oldmovie.setLaunchDate(movie.getLaunchDate());
        movierepository.save(oldmovie);}


    public void deletemovie(Integer id){
        movierepository.deleteById(id);
    }

}
