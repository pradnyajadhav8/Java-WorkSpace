package com.exception;

public class StudentDAOException extends RuntimeException {
	public StudentDAOException() {
		
	}
	public StudentDAOException(String msg) {
		super(msg);
	}
}
