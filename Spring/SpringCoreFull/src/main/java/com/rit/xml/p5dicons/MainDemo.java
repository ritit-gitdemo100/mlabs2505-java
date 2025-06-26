package com.rit.xml.p5dicons;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDemo {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("p5dicons.xml");
		
		//Vehicle vehicle = new Bike();	
		Vehicle vehicle = context.getBean("myvehicle", Vehicle.class);
		System.out.println(vehicle.getVehicle());
		System.out.println(vehicle.getTyre());
		context.close();

	}

}
