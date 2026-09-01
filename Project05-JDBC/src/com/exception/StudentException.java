package com.exception;

public class StudentException extends RuntimeException {
	public StudentException() {

	}

	public StudentException(String msg) {
		super(msg);
	}

	// Performance degreaded ,but code will be efficient..
	public StudentException(String msg, Throwable cause) {
		super(msg);
	}

}
