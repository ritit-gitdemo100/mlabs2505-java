package com.marlabs;

import java.util.ArrayList;
import java.util.List;

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
		
		List<Project> projectlist1 = new ArrayList<>();
		projectlist1.add(new Project("CRM Project"));
		projectlist1.add(new Project("ERP Project"));
		projectlist1.add(new Project("HRM Project"));
		
		Employee emp1 = new Employee("Anand","anand@gmail.com","98798689689");
		emp1.setProjects(projectlist1);
		session.persist(emp1);

		
		List<Project> projectlist2 = new ArrayList<>();
		projectlist2.add(session.get(Project.class, 2));
		projectlist2.add(session.get(Project.class, 3));
		
		Employee emp2 = new Employee("Gayathri","gayathri@gmail.com","98798681111");
		emp2.setProjects(projectlist2);
		session.persist(emp2);
		
		tx.commit();
		session.close();
	}
}
