package com.mvc.d4mvc;

public class Product {

	private String pname;
	private int qty;
	private double price;
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Product(String pname, int qty, double price) {
		super();
		this.pname = pname;
		this.qty = qty;
		this.price = price;
	}



	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
