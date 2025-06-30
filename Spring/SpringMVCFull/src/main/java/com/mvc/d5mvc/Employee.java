package com.mvc.d5mvc;

public class Employee {

	private String ename;
	private String gender; 
	private String qual;
	

	public Employee() {
		super();
	}

	public Employee(String ename, String gender, String qual) {
		super();
		this.ename = ename;
		this.gender = gender;
		this.qual = qual;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getQual() {
		return qual;
	}

	public void setQual(String qual) {
		this.qual = qual;
	}
	
	

}
