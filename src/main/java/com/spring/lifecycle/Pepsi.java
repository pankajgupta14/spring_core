package com.spring.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean{

	private int pepsi;

	public int getPepsi() {
		return pepsi;
	}

	public void setPepsi(int pepsi) {
		this.pepsi = pepsi;
	}

	public Pepsi(int pepsi) {
		super();
		this.pepsi = pepsi;
	}

	@Override
	public String toString() {
		return "Pepsi [pepsi=" + pepsi + "]";
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void destroy() throws Exception {
		 System.out.println(" i am going to destroy bye pepsiii");
		
	}

	public void afterPropertiesSet() throws Exception {
        System.out.println("init method hiii pepsi");		
	}
	
	
}
