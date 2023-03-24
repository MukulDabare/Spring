package com.model;

public class Student {

	private int id;
	private String name;
	private Address adr;
	public Student(int id, String name, Address adr) {
		
		this.id = id;
		this.name = name;
		this.adr = adr;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", adr=" + adr.areaName+" "+adr.cityName + "]";
	}
	
	
	
	


	
	
}
