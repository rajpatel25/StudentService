package com.example.application;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
(scanBasePackages={"com.example"})// same as @Configuration @EnableAutoConfiguration @ComponentScan combined
public class StudentServices2Application extends SpringBootServletInitializer {

	 @Override
	 protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	  return application.sources(StudentServices2Application.class);
	 }
	 
	public static void main(String[] args) {
		SpringApplication.run(StudentServices2Application.class, args);
	}
}
