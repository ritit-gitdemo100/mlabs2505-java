package com.rit.annot.p5difield;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bicycle implements Vehicle{

	@Autowired
	Tyre tyre;
	
	public String getVehicle() {
		return "Hi, Im using Bicycle !!!";
	}

	@Override
	public String getTyre() {
		return this.tyre.getTyre();
	}

}
