package com.model;

public class Student {

	private int id;
	private String name;
	private Address adr;
	public Student(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	public Address getAdr() {
		return adr;
	}
	public void setAdr(Address adr) {
		this.adr = adr;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}


	
	
}
