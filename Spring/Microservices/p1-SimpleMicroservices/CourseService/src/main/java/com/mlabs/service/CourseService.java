package com.mlabs.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mlabs.dto.request.CourseRequest;
import com.mlabs.dto.response.CourseResponse;
import com.mlabs.entity.Course;
import com.mlabs.repository.CourseRepository;

@Service
public class CourseService {

	Logger log = LoggerFactory.getLogger(CourseService.class);
	
	@Autowired
	private CourseRepository courseRepo;
	
	
	public CourseResponse saveCourse(CourseRequest courseRequest) {
		log.info("saveCourse service Method...");
		
		//Create an Entity
		Course course = new Course();
		
		//Copy data from Request Object to Entity
		course.setCourseName(courseRequest.getCourseName());
		course.setCourseFees(courseRequest.getCourseFees());
		
		//Persist Entity into DB
		Course savedCourse = courseRepo.save(course);
		
		//Convert returned saved Entity into Response Type
		CourseResponse response = new CourseResponse();
		response.setCourseId(savedCourse.getCourseId());
		response.setCourseName(savedCourse.getCourseName());
		response.setCourseFees(savedCourse.getCourseFees());
		
		//Return the response object
		return response;		
	}
	
	public CourseResponse getbyId(Long id) {
		log.info("getById service Method...");

		//Get the course entity
		Course course = courseRepo.findById(id).get();
		
		//Convert returned course Entity into Response Type
		CourseResponse response = new CourseResponse();
		response.setCourseId(course.getCourseId());
		response.setCourseName(course.getCourseName());
		response.setCourseFees(course.getCourseFees());
		
		//Return the response object
		return response;		
	}
	
}
