package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.model.Student;

@Configuration
public class AppConfig {
	@Bean (name = "s")
public Student stu() 
{
	Student s=new Student("Manik", 101);
	
  return s;	
}
	
}
