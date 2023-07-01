package com.SpringCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {

	 ApplicationContext con= new ClassPathXmlApplicationContext("com/SpringCollection/configemp.xml");
	 emp a=(emp) con.getBean("emp");
	 
	 System.out.println(a.getName());
	 System.out.println(a.getCity());
	 System.out.println(a.getPhonenumber());
	System.out.println(a.getCourses());
	System.out.println(a.getProp());
	}
}
