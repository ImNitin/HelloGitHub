package com.javabykiran.application.configuration;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.javabykiran.application.entity.Employee;

public class SpringBootHibernateConfig {

	
	public static SessionFactory getSession() {
		
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class);
		System.out.println("Read CFG");
		SessionFactory factory = cfg.buildSessionFactory();
		
		return factory;
	}
}
