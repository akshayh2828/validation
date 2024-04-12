package com.example.validation.ValidationProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.validation.ValidationProject.entity.User;
import com.example.validation.ValidationProject.repo.UserRepo;

import jakarta.validation.Valid;

@RestController
public class UserController {

	@Autowired
	private UserRepo repo;
	
	@PostMapping("/add")
	public User addUser(@RequestBody @Valid User user) {
		System.out.println("addUser executed...");
		return repo.save(user);
	}

}
