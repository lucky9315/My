package com.Lucky.RestControllerAdvicesPackage;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class HandleExceptionClass extends ResponseEntityExceptionHandler 
{

	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatusCode status, WebRequest request) 
	{
		BindingResult bindingResult=ex.getBindingResult();
		List<ObjectError> error=bindingResult.getAllErrors();
		List<String> list=new ArrayList<>();
		ExceptionsMessage exceptionsMessage=new ExceptionsMessage();
		exceptionsMessage.setMessage("error occured");
		for(ObjectError err:error)
		{
			System.out.println(err.getDefaultMessage());
			list.add(err.getDefaultMessage());
		}
		exceptionsMessage.setErrorMessages(list);
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exceptionsMessage);
	}
		
	
}
