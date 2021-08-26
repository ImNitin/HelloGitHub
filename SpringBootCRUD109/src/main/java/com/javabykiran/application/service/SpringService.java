package com.javabykiran.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javabykiran.application.dao.SpringDao;
import com.javabykiran.application.entity.Employee;

@Service
public class SpringService {

	@Autowired
	SpringDao springDao;
	
	public List<Employee> getAllEmployee() {

		List<Employee> list =	springDao.getAllEmployee();
		return list;
	}

	public List<Employee> getAllEmployeebyId(int id) {

		List<Employee> list =	springDao.getAllEmployeebyId(id);
		return list;
	}

	public List<Employee> getAllEmployeebyName(String name) {

		List<Employee> list =	springDao.getAllEmployeebyName(name);
		return list;
	}

	public String addEmployee(Employee emp) {

	String msg =	springDao.addEmployee(emp);
		return msg;
	}

}
