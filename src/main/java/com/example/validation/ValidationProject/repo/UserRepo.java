package com.example.validation.ValidationProject.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.validation.ValidationProject.entity.User;
@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

}
