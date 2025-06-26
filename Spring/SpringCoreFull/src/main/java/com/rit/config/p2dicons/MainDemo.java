package com.rit.config.p2dicons;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rit.config.p2dicons.VehicleConfig;

public class MainDemo {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new 
				AnnotationConfigApplicationContext(VehicleConfig.class);
		
		Vehicle vehicle = context.getBean("bicycle", Vehicle.class);
		System.out.println(vehicle.getVehicle());
		System.out.println(vehicle.getTyre());
		context.close();

	}

}
