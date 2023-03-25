package com.model;

public class Student {
	
 private int sid;
 private String name;
public Student(String name, int sid) {
	super();
	this.sid = sid;
	this.name = name;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", name=" + name + "]";
}


}
