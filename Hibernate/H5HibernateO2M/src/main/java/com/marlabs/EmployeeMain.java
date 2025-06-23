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
		
		Employee emp = new Employee("Bala","Marketing","Manager");

		List<Address> addressList = new ArrayList<>();
		addressList.add(new Address("Bangalore","Karnataka",476588, emp));
		addressList.add(new Address("Jaipur","Rajasthan",476588, emp));
		addressList.add(new Address("Hyderabad","Telungana",476588, emp));
		
		emp.setAddress(addressList);
		
		session.persist(emp);
		
		System.out.println("Record Inserted Successfully");
		
		emp = session.get(Employee.class, 1);
		System.out.println(emp);
		for(Address addr : emp.getAddress())
			System.out.println(addr);


		tx.commit();
		session.close();		
	}
}
