package com.rit.annot.p1simple;

import org.springframework.stereotype.Component;

//@Component("myvehicle") 
@Component
public class Bicycle implements Vehicle{

	public String getVehicle() {
		return "Hi, Im using Bicycle !!!";
	}

}
