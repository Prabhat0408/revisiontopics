package com.springcore.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.core.convert.Property;

public class Emp {
	private String empName;
	private List<String> phones;
	private Set<String> addresses;
	private Map<String,String> courses;
	private Property prop;
	public String getEmpName() {
		return empName;
	}
	public Emp(String empName, List<String> phones, Set<String> addresses, Map<String, String> courses, Property prop) {
		super();
		this.empName = empName;
		this.phones = phones;
		this.addresses = addresses;
		this.courses = courses;
		this.prop = prop;
	}
	public Property getProp() {
		return prop;
	}
	public void setProp(Property prop) {
		this.prop = prop;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Emp(String empName, List<String> phones, Set<String> addresses, Map<String, String> courses) {
		super();
		this.empName = empName;
		this.phones = phones;
		this.addresses = addresses;
		this.courses = courses;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Emp [empName=" + empName + ", phones=" + phones + ", addresses=" + addresses + ", courses=" + courses
				+ "]";
	}
	

}
