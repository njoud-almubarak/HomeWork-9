package com.example.exerw3d1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor @NoArgsConstructor
@Entity
@Data
@Table
public class Users {
    @Id
    private Integer id;
    @Column (name ="user_name",nullable = false,unique = true )
    private String username;
    private String emaile;
    private String password;
}
