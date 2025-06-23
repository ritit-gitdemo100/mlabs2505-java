package com.marlabs;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeMain {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
//		Address addr = new Address("Bangalore","Karnataka",476588);
//		Employee emp = new Employee("Bala","Marketing","Manager",addr);
//		session.persist(emp);

		
//		Employee emp = session.get(Employee.class, 1);
//		System.out.println(emp);
//		System.out.println(emp.getAddress());

		
		Employee emp = session.get(Employee.class, 1);
		if(emp != null)
			session.remove(emp);
				
		tx.commit();
		session.close();
		
	}
}
