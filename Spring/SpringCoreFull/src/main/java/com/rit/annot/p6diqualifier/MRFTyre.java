package com.rit.annot.p6diqualifier;

import org.springframework.stereotype.Component;

@Component
public class MRFTyre implements Tyre{

	public String getTyre() {
		return "Hi, Im using MRFTyre !!!";
	}

}
