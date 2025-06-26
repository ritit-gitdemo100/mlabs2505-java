package com.rit.xml.p4xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDemo {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("p4xml.xml");
		
		//Vehicle vehicle = new Bike();	
		Vehicle vehicle = context.getBean("myvehicle", Vehicle.class);
		System.out.println(vehicle.getVehicle());

		context.close();
	}

}
