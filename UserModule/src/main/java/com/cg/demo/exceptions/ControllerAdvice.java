package com.cg.demo.exceptions;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerAdvice {
	@ExceptionHandler(UserModuleException.class)
	public String appointmentException(Exception e) {
		return e.getMessage();
	}
}


