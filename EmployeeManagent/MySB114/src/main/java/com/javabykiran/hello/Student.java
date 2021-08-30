package com.javabykiran.hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("${salary}")
	int salary;
	
	
	public void show() {
		
		System.out.println("Student Salary = "+ salary);
		System.out.println("I am in Student Class");
	}
}
