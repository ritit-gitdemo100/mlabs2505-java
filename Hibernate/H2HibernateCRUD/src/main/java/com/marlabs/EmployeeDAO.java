package com.marlabs;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDAO {

	SessionFactory factory;
	
	public EmployeeDAO() {
		Configuration cfg = new Configuration().configure();
		factory = cfg.buildSessionFactory();
	}
	
	public String insertEmployee(Employee employee) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(employee);
		tx.commit();
		session.close();
		return "Inserted Successfully!";
	}	
	
	public String updateEmployee(Employee employee) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.merge(employee);
		tx.commit();
		session.close();
		return "Updated Successfully!";
	}
	
	public Employee getEmployee(int empId) {
		Session session = factory.openSession();
		Employee emp = new Employee();
		emp = session.get(Employee.class, empId);
		session.close();
		return emp;
	}
	
	
	public String deleteEmployee(int empId) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Employee emp = new Employee();
		emp.setEmpId(empId);
		session.remove(emp);
		tx.commit();
		session.close();
		return "Deleted Successfully!";
	}
	
}
