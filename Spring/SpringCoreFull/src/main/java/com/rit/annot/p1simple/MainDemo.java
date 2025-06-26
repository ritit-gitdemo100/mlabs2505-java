package com.rit.annot.p1simple;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDemo {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("p8annotation.xml");
		
		Vehicle vehicle1 = context.getBean("employeeService", Vehicle.class);
		Vehicle vehicle2 = context.getBean("bicycle", Vehicle.class);
		
		System.out.println(vehicle1);
		System.out.println(vehicle1);
		System.out.println(vehicle1==vehicle2);

		context.close();
	}

}
