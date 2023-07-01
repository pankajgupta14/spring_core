package com.spring.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employe {
	
	@Autowired
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employe(Address address) {
		super();
		this.address = address;
	}
	

	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employe [address=" + address + "]";
	}
 
	
}
