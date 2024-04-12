package com.example.validation.ValidationProject;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class APIExceptionHandller {
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handelInvalidArguments(
			MethodArgumentNotValidException exc){
		
		Map<String, String> errMap= new HashMap<String, String>();
		
		exc.getBindingResult().getFieldErrors().forEach(e->{
				errMap.put(e.getField(), e.getDefaultMessage());
				});
		return errMap;
	}

}
