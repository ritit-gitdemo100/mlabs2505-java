package com.mlabs.request;

import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class CreateBookRequest {

	@Size(min=3, max=10, message="Book name must be between 3 to 10 characters")
	String name;
	
	@Size(min=3, max=10)
	String author;
	
	@Positive
	double price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CreateBook [name=" + name + ", author=" + author + ", price=" + price + "]";
	}
	
	
}
