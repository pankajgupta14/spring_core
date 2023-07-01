package com.spring.streotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component /* ("pp") this is object name by given by us in this time controller creat given name by object*/
public class Student {

	@Value("pankaj gupta")
	private String street;
	
	@Value("bobag")
	private String city;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [street=" + street + ", city=" + city + "]";
	}
	
	
}
