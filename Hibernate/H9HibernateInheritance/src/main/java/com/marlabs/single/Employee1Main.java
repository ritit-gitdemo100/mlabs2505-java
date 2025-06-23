package com.marlabs.single;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Employee1Main {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		FullTimeEmployee1 femp1 = new FullTimeEmployee1();
		femp1.setName("Raj");
		femp1.setSalary(25000);
		femp1.setBonus(2000);
		session.persist(femp1);
		
		PartTimeEmployee1 pemp1 = new PartTimeEmployee1();
		pemp1.setName("Raj");
		pemp1.setSalary(25000);
		pemp1.setHoursWorked(15);
		session.persist(pemp1);
		
		tx.commit();
		session.close();
	}
}
