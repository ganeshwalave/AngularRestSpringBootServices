package com.persistent.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.persistent.controller.EmployeeController;

//@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.persistent.*"})//basePackageClasses ={EmployeeController.class}
public class AngularSpringBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AngularSpringBootAppApplication.class, args);
	}

}
