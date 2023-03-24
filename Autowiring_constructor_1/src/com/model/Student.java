package com.model;

public class Student {

	private int id;
	private String name;
	private Address adr;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(Address adr) {
		
		this.adr = adr;
	}
	public Address getAdr() {
		return adr;
	}
	@Override
	public String toString() {
		return "Student [adr=" + adr + "]";
	}
	
	
	


	
	
}
