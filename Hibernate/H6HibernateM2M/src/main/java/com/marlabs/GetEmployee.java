package com.marlabs;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class GetEmployee {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Query<Employee> qry = session.createQuery("From Employee");
		List<Employee> emps = qry.getResultList();
		
		for(Employee emp : emps) {
			System.out.println(emp);
			System.out.println(emp.getProjects());
		}
		
		tx.commit();
		session.close();
	}
}
