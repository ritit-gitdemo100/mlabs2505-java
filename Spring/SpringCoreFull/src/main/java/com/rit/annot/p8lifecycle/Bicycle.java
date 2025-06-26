package com.rit.annot.p8lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Bicycle implements Vehicle{

	public String getVehicle() {
		return "Hi, Im using Bicycle !!!";
	}

	@PostConstruct
	public void method1() {
		System.out.println("Initializing Bean ");
	}
	
	@PreDestroy
	public void method2() {
		System.out.println("Destroying Bean ");
	}
}
