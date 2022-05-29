package com.example.exerw3d1.controller;

import com.example.exerw3d1.model.Users;
import com.example.exerw3d1.services.Userservice;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1/user")
@RestController
@RequiredArgsConstructor
public class Usercontroller {
    private final Userservice userservice;

    @GetMapping
    public ResponseEntity getuser(){
        return ResponseEntity.status(200).body(userservice.getuser());
    }

    @PostMapping
    public ResponseEntity adduser(@RequestBody Users users ){
        userservice.adduser(users);
        return ResponseEntity.status(200).body("the user is added");
    }

    @PutMapping("{id}")
    public ResponseEntity updateuser(@PathVariable Integer id,@RequestBody Users users){
        userservice.updateuser(id,users);
        return ResponseEntity.status(200).body("user is updated");
    }

    @DeleteMapping("{id}")
    public ResponseEntity deleteuser(@PathVariable Integer id){
        userservice.deleteuser(id);
        return ResponseEntity.status(200).body("the user is deleted");
    }


}
