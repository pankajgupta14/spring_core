package com.springreff;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {

		 ApplicationContext con = new ClassPathXmlApplicationContext("com/springreff/ref.xml");
		 
		 A jj = (A) con.getBean("aref");

		 System.err.println(jj.getX());
		 System.out.println(jj.getOb().getY());
		 
		 System.out.println(jj);
	}

}
