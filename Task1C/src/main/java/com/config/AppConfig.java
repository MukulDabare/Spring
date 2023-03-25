package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.model.Employee;

@Configuration
public class AppConfig {
	@Bean
public Employee e() {
	Employee emp=new Employee(101,"Manik", 20000.500d, "Jammu", 986521564l);
	
	return emp;
	
}
	
}
