package com.mlabs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products")
public class ProductController {
	
	@PostMapping
	public String save() {
		return "Product Saved Successfully";
	}
	
	@GetMapping
	public String getAll(){
		return "Returning all products";
	}
	
	@GetMapping("/{id}")
	public String getById(@PathVariable int id){
		return "Product with id : "+id;
	}
	
}
