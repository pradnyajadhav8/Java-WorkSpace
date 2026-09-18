package com.exception;

public class EmployeeServiceException extends RuntimeException {

	public EmployeeServiceException() {
		
	}
	
	public EmployeeServiceException(String msg) {
		super(msg);
	}
}
