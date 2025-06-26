package com.rit.annot.p7scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("myvehicle")
@Scope("prototype")
public class Bicycle implements Vehicle{

	public String getVehicle() {
		return "Hi, Im using Bicycle !!!";
	}

}
