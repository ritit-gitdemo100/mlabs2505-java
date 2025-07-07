package com.mlabs.response;

import java.time.LocalDateTime;

public class ErrorResponse {

	private LocalDateTime timestamp;
	private int status;
	private String error;
	
	public ErrorResponse() {
		super();
	}

	public ErrorResponse(int status, String error) {
		super();
		this.timestamp = LocalDateTime.now();
		this.status = status;
		this.error = error;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
	
	
	
	
	
}
