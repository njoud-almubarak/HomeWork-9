package com.example.exerw3d1.Repository;

import com.example.exerw3d1.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Userrepository extends JpaRepository<Users,Integer> {
}
