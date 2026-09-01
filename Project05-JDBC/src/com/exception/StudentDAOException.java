package com.exception;

public class StudentDAOException extends RuntimeException {
	public StudentDAOException() {

	}

	public StudentDAOException(String msg) {
		super(msg);
	}

	public StudentDAOException(String msg, Throwable cause) {
		super(msg);
	}
}
