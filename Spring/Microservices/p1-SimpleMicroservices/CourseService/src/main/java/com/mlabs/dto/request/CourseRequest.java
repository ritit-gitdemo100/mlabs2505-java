package com.mlabs.dto.request;

public class CourseRequest {

	private String courseName;
	private Double courseFees;

	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Double getCourseFees() {
		return courseFees;
	}
	public void setCourseFees(Double courseFees) {
		this.courseFees = courseFees;
	}
}
