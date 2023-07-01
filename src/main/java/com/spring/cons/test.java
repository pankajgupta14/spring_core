package com.spring.cons;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) throws InterruptedException {
		 
	 ApplicationContext con = new ClassPathXmlApplicationContext("com/spring/cons/const-config.xml");
     Person b = (Person) con.getBean("person");
     
     System.out.println(b);
     System.out.println(b.hashCode());
     b.wait();
	}

}
