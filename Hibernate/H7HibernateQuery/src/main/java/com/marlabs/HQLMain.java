package com.marlabs;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;


public class HQLMain {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
			
		Query<Employee> qry = null;
		
		System.out.println("\nHibernate Query Language (HQL)");
		qry = session.createQuery("From Employee", Employee.class);
		qry.list().forEach(System.out::println);

		System.out.println("\nHQL with Positional parameter");
		qry = session.createQuery("From Employee where department=?1", Employee.class);
		qry.setParameter(1, "Marketing");
		qry.list().forEach(System.out::println);
		
		
		System.out.println("\nHQL with named parameters");
		qry = session.createQuery("From Employee where designation=:desig ", Employee.class);
		qry.setParameter("desig", "Manager");
		qry.list().forEach(System.out::println);

		System.out.println("\nNative SQL Query");
		String nqry = "select * from h1_employee were empName like 'V%'";
		NativeQuery<Employee> emps = session.createNativeQuery(nqry, Employee.class);
		emps.list().forEach(System.out::println);
		
		
		System.out.println("\nHibernate Criteria Query Language (HCQL)");
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Employee> cr = cb.createQuery(Employee.class);
		
		Root<Employee> root = cr.from(Employee.class);
		cr.select(root);
		
		Predicate pred = cb.equal(root.get("department"), "Accounts");
		cr.where(pred);
		
		qry = session.createQuery(cr);
		qry.list().forEach(System.out::println);
		

		
		tx.commit();
		session.close();
	}
}
