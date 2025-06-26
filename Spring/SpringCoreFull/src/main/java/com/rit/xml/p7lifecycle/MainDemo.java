package com.rit.xml.p7lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDemo {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("p7lifecycle.xml");
		
		Vehicle vehicle = context.getBean("myvehicle", Vehicle.class);
		System.out.println(vehicle.getVehicle());

		context.close();
	}

}
