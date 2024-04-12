package com.example.validation.ValidationProject;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = NationalityValidation.class)
public @interface ValidateNationality {

	public String message() default  "You Are Not From INDIA OR USA";

	Class<?>[] groups()default{};
	
	Class<? extends Payload>[]payload()default{};

}
