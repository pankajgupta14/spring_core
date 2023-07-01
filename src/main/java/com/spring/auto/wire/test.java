package com.spring.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		 
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/auto/wire/autoconfig.xml");
		Employe a = (Employe) context.getBean("emp1");
		System.out.println(a);
	}

}
