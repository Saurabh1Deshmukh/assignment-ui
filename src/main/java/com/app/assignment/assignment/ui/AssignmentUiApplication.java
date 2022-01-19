package com.app.assignment.assignment.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AssignmentUiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssignmentUiApplication.class, args);
	}

}
