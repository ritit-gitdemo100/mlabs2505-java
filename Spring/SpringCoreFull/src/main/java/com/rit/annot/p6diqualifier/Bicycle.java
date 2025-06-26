package com.rit.annot.p6diqualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Bicycle implements Vehicle{

	@Autowired
	@Qualifier("MRFTyre")
	Tyre tyre;
	
	public String getVehicle() {
		return "Hi, Im using Bicycle !!!";
	}

	@Override
	public String getTyre() {
		return this.tyre.getTyre();
	}

}
