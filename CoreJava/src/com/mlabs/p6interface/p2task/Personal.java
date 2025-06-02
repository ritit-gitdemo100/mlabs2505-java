package com.mlabs.p6interface.p2task;

public class Personal implements InputOutput{

	String name;
	String gender;
	String phone;
	String email;
	String address;
	String city;
	
	void greatWeekEnd(String name, String gender, String phone, String email, String address, String city) {
		this.name = name;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.city = city;
	}
	
	public void printDetails() {
		System.out.println(name);
		System.out.println(gender);
		System.out.println(phone);
		System.out.println(email);
		System.out.println(address);
		System.out.println(city);
	}
}
