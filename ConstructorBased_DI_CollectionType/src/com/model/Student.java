package com.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

	   private List<String> list;
	   private Set<Integer> set;
	   private Map<String, Integer> map;
	public Student(List<String> list, Set<Integer> set, Map<String, Integer> map) {
		
		this.list = list;
		this.set = set;
		this.map = map;
	}
	@Override
	public String toString() {
		this.list.forEach(l-> System.out.println(l));
		this.set.forEach(s-> System.out.println(s));
		this.map.forEach((k,v)->{
			System.out.println(k+":- "+v);
		});
		return "All data Displayed ";
	}
	
	   
 

	
	
}
