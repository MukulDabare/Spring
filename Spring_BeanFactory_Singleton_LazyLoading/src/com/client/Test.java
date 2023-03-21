package com.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.model.Student;

public class Test {

	public static void main(String[] args) {
        //By using Core Container or BeanFactory.
		Resource r = new ClassPathResource("beans.xml");
		BeanFactory bf = new XmlBeanFactory(r);
//		Student s = bf.getBean("s",Student.class);
//		System.out.println(s);
//		Student s2 = bf.getBean("s", Student.class);
//		System.out.println(s2);
	
		
	}

}
