package com.mlabs.exception;

public class NegativeInputException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public NegativeInputException() {
		super();
	}
	
	public NegativeInputException(String message) {
		super(message);
	}
	

}
