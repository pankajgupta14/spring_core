package com.spring.streotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext a = new ClassPathXmlApplicationContext("com/spring/streotype/config.xml");
		Student p = (Student) a.getBean("student");
		System.out.println(p);
	}
}
