package com.mlabs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

	@GetMapping
	public String home() {
		return "Welcome Home ";
	}
	
	@GetMapping("/admin/{id}")
	public String admin(@PathVariable int id) {
		return "Welcome Admin, Id is " + id;
	}

	@GetMapping("/user/{id}")
	public String user(@PathVariable int id) {
		return "Welcome User, Id is " + id;
	}


}
