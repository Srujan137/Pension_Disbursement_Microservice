package com.cts.disbursepension.exception;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ErrorResponseNoFieldErrors {
	private LocalDateTime timestamp;
	private String message;
	
	
	public ErrorResponseNoFieldErrors(String message) {
		this.timestamp = LocalDateTime.now();
		this.message = message;
	}

}
