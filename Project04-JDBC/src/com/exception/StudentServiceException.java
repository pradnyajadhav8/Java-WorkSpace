package com.exception;

public class StudentServiceException extends RuntimeException {
	public StudentServiceException() {
		
	}
	public StudentServiceException(String msg) {
		super(msg);
	}
	
}
