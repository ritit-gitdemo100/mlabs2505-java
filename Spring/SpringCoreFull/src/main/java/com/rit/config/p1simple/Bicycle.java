package com.rit.config.p1simple;

import org.springframework.stereotype.Component;

@Component
public class Bicycle implements Vehicle{

	public String getVehicle() {
		return "Hi, Im using Bicycle !!!";
	}

}

