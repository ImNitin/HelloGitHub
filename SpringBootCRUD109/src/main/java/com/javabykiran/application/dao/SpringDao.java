package com.javabykiran.application.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.javabykiran.application.configuration.SpringBootHibernateConfig;
import com.javabykiran.application.entity.Employee;

@Repository
public class SpringDao {

	
	SessionFactory sessionFactory = SpringBootHibernateConfig.getSession();
	
	public List<Employee> getAllEmployee() {

		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		List<Employee> list =	criteria.list();
		return list;
	}

	public List<Employee> getAllEmployeebyId(int id) {

		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("id", id));
		List<Employee> list =	criteria.list();
		return list;
	}

	public List<Employee> getAllEmployeebyName(String name) {

		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("name", name));
		List<Employee> list =	criteria.list();
		return list;
	}

	public String addEmployee(Employee emp) {

		Employee employee=new Employee();
		employee.setId(emp.getId());
		employee.setName(emp.getName());
		employee.setContact(emp.getContact());
		employee.setStatus(emp.getStatus());
		employee.setDepartment(emp.getDepartment());
		employee.setCreatedby(emp.getCreatedby());
		employee.setCreateddtm(emp.getCreateddtm());
		employee.setUpdatedby(emp.getUpdatedby());
		employee.setUpdateddtm(emp.getUpdateddtm());
		employee.setAge(emp.getAge());
		
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		session.save(employee);
		transaction.commit();
		
	
		return "Employee Addedd Success";
	}

}
