package com.mind2codes.gsemaquis.domain;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

public class ErrorModel {

	private HttpStatus httpStatus;
	private LocalDateTime timestamp;
	private String message;
	private String details;
	/**
	 * @param httpStatus
	 * @param message
	 * @param details
	 */
	public ErrorModel(HttpStatus httpStatus, String message, String details) {
		super();
		this.httpStatus = httpStatus;
		this.message = message;
		this.details = details;
	}
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	/**
	 * 
	 */
	public ErrorModel() {
		super();
		// TODO Auto-generated constructor stub
	}
}
