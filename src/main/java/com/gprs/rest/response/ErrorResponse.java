package com.gprs.rest.response;

import org.springframework.stereotype.Component;

@Component
public class ErrorResponse {
	
	private int status;
	private String message;
	
	private String timestamp;

	
	public ErrorResponse() {
	}

	public ErrorResponse(int status, String message, String timestamp) {
		this.status = status;
		this.message = message;
		this.timestamp = timestamp;
	}

	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the timestamp
	 */
	public String getTimestamp() {
		return timestamp;
	}

	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	
	
}
