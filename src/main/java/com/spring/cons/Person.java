package com.spring.cons;

public class Person {

	private String id;
	private int personid;
	
	public Person(String id, int personid) {
		super();
		this.id = id;
		this.personid = personid;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", personid=" + personid + "]";
	}
	
	
}
