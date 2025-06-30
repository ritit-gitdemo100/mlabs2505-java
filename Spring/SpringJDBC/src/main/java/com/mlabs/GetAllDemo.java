package com.mlabs;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GetAllDemo {
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("app-ctx.xml");

		StudentDaoImpl studentDaoImpl = (StudentDaoImpl) context.getBean("studentDao");
		List<Student> studentList = studentDaoImpl.getAllStudents();
		for (Student student : studentList) {
			System.out.println(student);
		}
	}
}
