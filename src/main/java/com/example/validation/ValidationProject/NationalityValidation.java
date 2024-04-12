package com.example.validation.ValidationProject;

import java.util.Arrays;
import java.util.List;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class NationalityValidation implements ConstraintValidator<ValidateNationality, String>{

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		
		List<String> validNationalityNameList = Arrays.asList("IND","USA");
		
		return validNationalityNameList.contains(value);
	}

}
