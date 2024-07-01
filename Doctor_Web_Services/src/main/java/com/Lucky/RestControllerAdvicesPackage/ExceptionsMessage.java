package com.Lucky.RestControllerAdvicesPackage;

import java.util.List;

public class ExceptionsMessage 
{
	private String message;
	private List<String> errorMessages;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<String> getErrorMessages() {
		return errorMessages;
	}
	public void setErrorMessages(List<String> errorMessages) {
		this.errorMessages = errorMessages;
	}
	
	
}
