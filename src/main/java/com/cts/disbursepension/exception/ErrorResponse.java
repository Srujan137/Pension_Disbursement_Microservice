package com.cts.disbursepension.exception;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;

@Getter
public class ErrorResponse {
	private LocalDateTime timestamp;
	private String message;
	
	
	@JsonInclude(Include.NON_NULL)
	private List<String> fieldErrors;
	
	public ErrorResponse(String message) {
		this.timestamp = LocalDateTime.now();
		this.message = message;
	}

	public ErrorResponse(String message, List<String> fieldErrors) {
		this.timestamp = LocalDateTime.now();
		this.message = message;
		this.fieldErrors = fieldErrors;
	}
}
