package com.rit.annot.p4dimethod;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDemo {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("p8annotation.xml");
		
		Vehicle vehicle = context.getBean("bicycle", Vehicle.class);
		System.out.println(vehicle.getVehicle());
		System.out.println(vehicle.getTyre());
		context.close();

	}

}
