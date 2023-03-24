package com.cilent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Student;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		Student s = ac.getBean("s", Student.class);
		System.out.println(s);
		System.out.println(s.getAdr().getAreaName());
		System.out.println(s.getAdr().getCityName());
	}

}