package com.spring.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		AbstractApplicationContext con = new ClassPathXmlApplicationContext("com/spring/lifecycle/lifecycleconfig.xml");
	
		samosa b = (samosa) con.getBean("samosa");
		System.out.println(b);
		con.registerShutdownHook();
		
		Pepsi p = (Pepsi) con.getBean("p1");
		System.out.println(p);
		
	}
}
