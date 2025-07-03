package com.mlabs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mlabs.model.Student;

@RestController
@RequestMapping("staff")
public class P2 {

	@GetMapping("/m1/{roll}/{name}/{mark}")
	public String usingPath(@PathVariable int roll, @PathVariable String name, @PathVariable double mark) {
		String response = "Roll : "+roll+"\nName : "+name+"\nMark : "+mark;
		return  response;
	}
	
	@GetMapping("/m2")
	public String usingParam(@RequestParam int roll, @RequestParam String name, @RequestParam double mark) {
		String response = "Roll : "+roll+"\nName : "+name+"\nMark : "+mark;
		return  response;
	}
	
	@GetMapping("/m3/{mark}")
	public String usingHeader(@RequestHeader int roll, @RequestHeader String name, @PathVariable double mark) {
		String response = "Roll : "+roll+"\nName : "+name+"\nMark : "+mark;
		return  "Using Header\n\n"+response;
	}
	
	
	@GetMapping("/m4")
	public Student usingBody(@RequestBody Student student) {
		
		return student ;
	}
	
	
	
	
}
