package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;
import com.model.Employee;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		
	Employee e = ac.getBean("e", Employee.class);
		System.out.println(e);
}
}
