package com.example.exerw3d1.controller;

import com.example.exerw3d1.model.Movie;
import com.example.exerw3d1.model.Users;
import com.example.exerw3d1.services.Movieservices;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("/api/v1/movie")
@RestController
@RequiredArgsConstructor
public class Moviecontroller {

    private final Movieservices movieservices;

    @GetMapping
    public ResponseEntity getmovie(){
        return ResponseEntity.status(200).body(movieservices.getmovie());
    }

   //, @DateTimeFormat(pattern = "dd.MM.yyyy")
    @PostMapping
    public ResponseEntity addmovie( @RequestBody @Valid  Movie movie){
       /* String message=errors.getFieldError().getDefaultMessage();
        if(errors.hasErrors())
            return ResponseEntity.status(400).body(message);*/
        movieservices.addmovie(movie);
        return ResponseEntity.status(200).body("the movie is added");
    }

    @PutMapping("{id}")
    public ResponseEntity updatemovie(@PathVariable Integer id,@RequestBody @Valid Movie movie){
     /*   String message=errors.getFieldError().getDefaultMessage();
        if(errors.hasErrors())
            return ResponseEntity.status(400).body(message);*/
        movieservices.updatemovie(id,movie);
        return ResponseEntity.status(200).body("movie is updated");
    }

    @DeleteMapping("{id}")
    public ResponseEntity deletemovie(@PathVariable Integer id){
        movieservices.deletemovie(id);
        return ResponseEntity.status(200).body("the movie is deleted");
    }
}
