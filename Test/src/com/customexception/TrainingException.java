package com.customexception;

public class TrainingException extends Exception {

	public TrainingException(String message) {
		super(message);
	}

	@Override
	public String getMessage() {
		System.err.println("Exception case occured");
		return super.getMessage();
	} 
	
}
