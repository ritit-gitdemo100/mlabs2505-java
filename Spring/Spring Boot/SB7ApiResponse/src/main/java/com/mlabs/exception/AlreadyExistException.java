package com.mlabs.exception;

public class AlreadyExistException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public AlreadyExistException() {
		super();
	}
	
	public AlreadyExistException(String message) {
		super(message);
	}
	

}
