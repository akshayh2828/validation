package com.example.validation.ValidationProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ValidationProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext conextIoc=SpringApplication.run(ValidationProjectApplication.class, args);
	System.out.println("ioc:"+conextIoc.getDisplayName());
	}

}
