package com.model;

public class Employee {
	
 private int eid;
 private String ename;
 private double salary;
 private String addr;
 private long mobno;
public Employee(int eid, String ename, double salary, String addr, long mobno) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.salary = salary;
	this.addr = addr;
	this.mobno = mobno;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", addr=" + addr + ", mobno=" + mobno
			+ "]";
}




}
