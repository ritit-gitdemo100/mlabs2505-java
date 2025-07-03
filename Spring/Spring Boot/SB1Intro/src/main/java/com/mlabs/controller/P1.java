package com.mlabs.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("stud")
public class P1 {

	@GetMapping
	public String findAll() {
		return "Get Student";
	}
	
	@GetMapping("/id")
	public String findById() {
		return "Get Student By Id";
	}
	
	@GetMapping("/name")
	public String findByName() {
		return "Get Student By Name";
	}
	
	@PostMapping
	public String save() {
		return "Add a Student";
	}
	
	@PutMapping
	public String update() {
		return "Update a Student";
	}
	
	@DeleteMapping
	public String delete() {
		return "Delete a Student";
	}
	
	
}
