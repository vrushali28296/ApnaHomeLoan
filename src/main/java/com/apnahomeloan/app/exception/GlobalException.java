package com.apnahomeloan.app.exception;

import java.util.HashMap;

import java.util.Map;

import org.springframework.http.HttpStatus; 
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<?> MethodArgumentNotValidExceptionHandller(MethodArgumentNotValidException e){
		
		
		
		Map<String, String> map=new HashMap<>();
		
		for (FieldError fe :e.getBindingResult().getFieldErrors()) {
			map.put(fe.getField(), fe.getDefaultMessage());
		}
		
		return new ResponseEntity<>(map,HttpStatus.BAD_REQUEST);
	}
}