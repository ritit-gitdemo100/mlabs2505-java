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

import com.mlabs.dto.request.CourseRequest;
import com.mlabs.dto.response.CourseResponse;
import com.mlabs.service.CourseService;

@RestController
@RequestMapping("/api/course")
public class CourseController {
	
	Logger log = LoggerFactory.getLogger(CourseController.class);
	
	
	@Autowired
	private CourseService courseService;
	
	@PostMapping
	public CourseResponse saveCourse(@RequestBody CourseRequest courseRequest) {
		log.info("saveCourse Controller Method...");
		return courseService.saveCourse(courseRequest);
	}

	@GetMapping("/{courseId}")
	public CourseResponse getById(@PathVariable Long id) {
		log.info("getById Controller Method...");
		return courseService.getbyId(id);
	}
	
}

