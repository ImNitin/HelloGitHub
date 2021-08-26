package com.javabykiran.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javabykiran.application.entity.Employee;
import com.javabykiran.application.service.SpringService;

@RestController
public class SpringController {
	
	@Autowired
	SpringService springService;
	
	@GetMapping("/getallemplyeesfromtable")
	public List<Employee> getAllEmployee() {
		
		List<Employee> list =	springService.getAllEmployee();
		return list;
	}
	
	@GetMapping("/getspeciiificempbyid/{id}")
	public List<Employee> getAllEmployeebyId(@PathVariable int id) {
		
		List<Employee> list =	springService.getAllEmployeebyId(id);
		return list;
	}
	
	@GetMapping("/getspeciiificempbyname/{name}")
	public List<Employee> getAllEmployeebyName(@PathVariable String name) {
		
		List<Employee> list =	springService.getAllEmployeebyName(name);
		return list;
	}
	
	@PostMapping("/addemployeeintable")
	public String addEmployee(@RequestBody Employee emp) {
		
		String  list =	springService.addEmployee(emp);
		return list;
	}

}
