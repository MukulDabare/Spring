package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Student;

public class Test {

	public static void main(String[] args) {
        //By using Application Context or J2ee Container.
		ApplicationContext ac= new ClassPathXmlApplicationContext("beans.xml");
		Student s = ac.getBean("s", Student.class);
		s.display();
		
	}

}
