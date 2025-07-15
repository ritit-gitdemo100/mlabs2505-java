package com.mlabs.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mlabs.dto.request.StudentRequest;
import com.mlabs.dto.response.StudentResponse;
import com.mlabs.entity.Student;
import com.mlabs.repository.StudentRepository;

@Service
public class StudentService {

	Logger log = LoggerFactory.getLogger(StudentService.class);
	
	@Autowired
	private StudentRepository studentRepo;
	
	
	public StudentResponse saveStudent(StudentRequest studentRequest) {
		log.info("saveCourse service Method...");
		
		//Create an Entity
		Student student = new Student();
		
		//Copy data from Request Object to Entity
		student.setFirstName(studentRequest.getFirstName());
		student.setLastName(studentRequest.getLastName());
		student.setEmail(studentRequest.getEmail());
		student.setCourseId(studentRequest.getCourseId());
		
		//Persist Entity into DB
		Student savedStudent = studentRepo.save(student);
		
		//Convert returned saved Entity into Response Type
		StudentResponse response = new StudentResponse();
		response.setStudentId(savedStudent.getStudentId());
		response.setFirstName(savedStudent.getFirstName());
		response.setLastName(savedStudent.getLastName());
		response.setEmail(savedStudent.getEmail());
		response.setCourseId(savedStudent.getCourseId());

		//Return the response object
		return response;		
	}
	
	public StudentResponse getbyId(Long id) {
		log.info("getById service Method...");

		//Get the student entity
		Student student = studentRepo.findById(id).get();
		
		//Convert returned student Entity into Response Type
		StudentResponse response = new StudentResponse();
		response.setStudentId(student.getStudentId());
		response.setFirstName(student.getFirstName());
		response.setLastName(student.getLastName());
		response.setEmail(student.getEmail());
		response.setCourseId(student.getCourseId());
		
		//Return the response object
		return response;		
	}
	
}
