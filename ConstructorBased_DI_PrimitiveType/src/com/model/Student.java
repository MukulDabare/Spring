package com.model;

public class Student {

	private int id;
	private String name;
	public Student(int id, String name) {
	
		this.id = id;
		this.name = name;
	}
	public void display() {
		System.out.println(this.id);
		System.out.println(this.name);
		
	}
	
	
	
}