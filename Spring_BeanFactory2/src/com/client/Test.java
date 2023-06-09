package com.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.model.Student;
import com.model.Teacher;

public class Test {

	public static void main(String[] args) {
        //By using Core Container or BeanFactory.
		Resource r = new ClassPathResource("beans.xml");
		BeanFactory bf = new XmlBeanFactory(r);
		Student s = bf.getBean("s",Student.class);
		s.display();
		System.out.println(s);
		System.out.println("How you doing?");
		Teacher t = bf.getBean("t", Teacher.class);
		System.out.println(t);
		Teacher t2 = bf.getBean("t", Teacher.class);
		System.out.println(t2);
	   
	   
		
	}

}
