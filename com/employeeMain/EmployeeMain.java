package com.employeeMain;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.employee.CompanyCar;
import com.employee.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(CompanyCar.class);
		cfg.addAnnotatedClass(Employee.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		CompanyCar c = new CompanyCar();
		c.setC_name("Tata");
		c.setCar_id(102);
		c.setColor("balck");
		c.setModelYear(2022);
		ss.persist(c);
		
		Employee e = new Employee();
		e.setE_name("Shravani");
		e.setAddress("Sangli");
		e.setDepa("Design Management");
		e.setCom(c);
		
		ss.persist(e);
		tr.commit();
		
	}

}
