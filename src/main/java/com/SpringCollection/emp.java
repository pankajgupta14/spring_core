package com.SpringCollection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class emp {

	
	private String name;
	private List<String> phonenumber ;
	private Set<String> city;
	private Map<String, String> courses ;
	private Properties prop;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(List<String> phonenumber) {
		this.phonenumber = phonenumber;
	}
	public Set<String> getCity() {
		return city;
	}
	public void setCity(Set<String> city) {
		this.city = city;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	
	
	public Properties getProp() {
		return prop;
	}
	public void setProp(Properties prop) {
		this.prop = prop;
	}
	
	
	public emp(String name, List<String> phonenumber, Set<String> city, Map<String, String> courses, Properties prop) {
		super();
		this.name = name;
		this.phonenumber = phonenumber;
		this.city = city;
		this.courses = courses;
		this.prop = prop;
	}
	 
	public emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "emp [name=" + name + ", phonenumber=" + phonenumber + ", city=" + city + ", courses=" + courses
				+ ", prop=" + prop + "]";
	}
	 
	
	
	
}
