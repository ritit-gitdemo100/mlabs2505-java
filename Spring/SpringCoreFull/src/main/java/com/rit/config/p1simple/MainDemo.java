package com.rit.config.p1simple;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemo {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new 
				AnnotationConfigApplicationContext(VehicleConfig.class);
		
		Vehicle vehicle = context.getBean("bicycle", Vehicle.class);
		System.out.println(vehicle.getVehicle());

		context.close();
	}

}
