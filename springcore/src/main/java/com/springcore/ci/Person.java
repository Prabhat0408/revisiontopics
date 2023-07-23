package com.springcore.ci;

import java.util.List;

public class Person {
	private String name;
	private int id;
	private Certi cert;
	private List<String> list;
	
	public Person(String name, int id, Certi cert, List<String> list) {
		super();
		this.name = name;
		this.id = id;
		this.cert= cert;
		this.list= list;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", cert=" + cert + ", list=" + list + "]";
	}


	


}
