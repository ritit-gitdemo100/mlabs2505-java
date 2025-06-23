package com.marlabs.joined;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Employee3Main {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		FullTimeEmployee3 femp = new FullTimeEmployee3();
		femp.setName("Raj");
		femp.setSalary(25000);
		femp.setBonus(2000);
		session.persist(femp);

		PartTimeEmployee3 pemp = new PartTimeEmployee3();
		pemp.setName("Raj");
		pemp.setSalary(25000);
		pemp.setHoursWorked(15);
		session.persist(pemp);
		
		tx.commit();
		session.close();
	}
}
