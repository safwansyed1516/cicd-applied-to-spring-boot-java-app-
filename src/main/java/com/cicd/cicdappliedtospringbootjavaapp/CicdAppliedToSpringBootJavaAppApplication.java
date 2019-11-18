package com.cicd.cicdappliedtospringbootjavaapp;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdAppliedToSpringBootJavaAppApplication {

	@GetMapping("/test")
	public String helloMessage() {
		long currentDateTime = System.currentTimeMillis();
		Date currentDate = new Date(currentDateTime);
		return "Hello! deployed at" + currentDate;
	}

	public static void main(String[] args) {
		SpringApplication.run(CicdAppliedToSpringBootJavaAppApplication.class, args);
	}

}
