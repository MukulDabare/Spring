package com.cilent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Student;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		Student s = ac.getBean("s", Student.class);
		
		s.getList().forEach(l-> System.out.println(l));
		s.getSet().forEach(se-> System.out.println(se));
		s.getMap().forEach((k,v)->{
			System.out.println(k+":- "+v);
			
		});
		
	}

}
