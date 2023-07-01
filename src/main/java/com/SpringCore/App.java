package com.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext  context = new ClassPathXmlApplicationContext("config.xml");
        Studentbean st = (Studentbean) context.getBean("student");
        System.out.println(st);
        System.out.println("");
        //2nd type using value as attirbute
		/*
		 * Studentbean st1=(Studentbean) context.getBean("student1");
		 * System.out.println(st1);
		 * 
		 * //3rd type using p schema System.out.println(""); Studentbean st2 =
		 * (Studentbean) context.getBean("student2"); System.out.println(st2);
		 */
    }
}
