package com.spring.withoutxml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext con= new  AnnotationConfigApplicationContext(javaconfig.class);
		Student a = con.getBean("student",Student.class);
		a.name();
		
	}
}
