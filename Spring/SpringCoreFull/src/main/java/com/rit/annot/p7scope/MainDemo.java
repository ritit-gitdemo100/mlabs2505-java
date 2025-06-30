package com.rit.annot.p7scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDemo {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("p8annotation.xml");
		

		Vehicle v1 = context.getBean("myvehicle", Vehicle.class);
		Vehicle v2 = context.getBean("myvehicle", Vehicle.class);
		
		System.out.println("Are Same Objects : "+(v1 == v2));
		System.out.println("v1  : "+v1);
		System.out.println("v2  : "+v2);

		context.close();
	}

}
