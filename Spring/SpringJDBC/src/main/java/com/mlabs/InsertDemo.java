package com.mlabs;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InsertDemo {
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("app-ctx.xml");

		StudentDaoImpl studentDaoImpl = (StudentDaoImpl) context.getBean("studentDao");

		Student student = new Student(202, "Anand", "Computers");
		int res = studentDaoImpl.saveStudent(student);
		if (res == 0)
			System.out.println("Error Saving Student");
		else {
			System.out.println(studentDaoImpl.getStudentById(202));
			student.setDepartment("Science");
			studentDaoImpl.updateStudent(student);
			System.out.println(studentDaoImpl.getStudentById(202));
			//studentDaoImpl.deleteStudent(202);
			//System.out.println("Record Deleted");
		}
	}
}
