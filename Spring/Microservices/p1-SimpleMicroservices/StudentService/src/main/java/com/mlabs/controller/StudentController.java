package com.mlabs.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mlabs.dto.request.StudentRequest;
import com.mlabs.dto.response.StudentResponse;
import com.mlabs.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {
	
	Logger log = LoggerFactory.getLogger(StudentController.class);
	
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping
	public StudentResponse saveCourse(@RequestBody StudentRequest studentRequest) {
		log.info("saveCourse Controller Method...");
		return studentService.saveStudent(studentRequest);
	}

	@GetMapping("/{studentId}")
	public StudentResponse getById(@PathVariable("studentId") Long id) {
		log.info("getById Controller Method...");
		return studentService.getbyId(id);
	}
	
}

