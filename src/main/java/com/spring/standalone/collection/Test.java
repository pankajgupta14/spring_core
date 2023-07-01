package com.spring.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext c= new ClassPathXmlApplicationContext("com/spring/standalone/collection/config.xml");
		Person  b = c.getBean("person",Person.class);
		System.out.println(b);
	}
}
