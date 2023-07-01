package com.spring.withoutxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan ( basePackages = "com.spring.withoutxml")
public class javaconfig {
	
	@Bean
	 public Student student()
	 {
		 Student student= new Student();
		 return student;
	 }

	 
}
