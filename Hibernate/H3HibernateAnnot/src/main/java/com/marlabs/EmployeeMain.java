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
		
		Employee emp = new Employee(103,"Vineeth","Manager","Analytics");
		session.persist(emp);
		System.out.println("Record Inserted Successfully");
		
		tx.commit();
		session.close();

	}
}
