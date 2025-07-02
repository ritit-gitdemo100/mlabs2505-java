package com.mlabs.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mlabs.config.AppConfig;
import com.mlabs.dao.StudentDao;
import com.mlabs.entity.Student;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		StudentDao dao = context.getBean(StudentDao.class);

//		Student s1 = new Student();
//		s1.setName("John");
//		s1.setDepartment("Maths");
//		dao.insert(s1);
//
//		Student s = dao.getById(1);
//		System.out.println(s);
//		s.setDepartment("Computers");
//		dao.update(s);
//		System.out.println(s);


		dao.delete(1);

		context.close();
	}
}
