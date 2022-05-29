package com.example.exerw3d1.services;

import com.example.exerw3d1.Repository.Userrepository;
import com.example.exerw3d1.model.Users;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class Userservice {

private  final Userrepository userrepository;
    public List<Users> getuser(){
       return userrepository.findAll();
    }

    public void adduser(Users users){
        userrepository.save(users);
    }

    public void updateuser(Integer id,Users users){
        Users olduser =userrepository.findById(id).get();
        olduser.setId(id);
        olduser.setUsername(users.getUsername());
        olduser.setEmaile(users.getEmaile());
        olduser.setPassword(users.getPassword());
        userrepository.save(olduser);
    }

    public void deleteuser(Integer id){
        userrepository.deleteById(id);
    }

}
