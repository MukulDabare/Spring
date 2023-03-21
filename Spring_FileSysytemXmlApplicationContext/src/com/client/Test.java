package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.model.Student;

public class Test {

	public static void main(String[] args) {
        //By using FileSystemXmlApplicationContext
		ApplicationContext ac= new FileSystemXmlApplicationContext("E:\\beans.xml");
		Student s = ac.getBean("s", Student.class);
		s.display();
		
	}

}
