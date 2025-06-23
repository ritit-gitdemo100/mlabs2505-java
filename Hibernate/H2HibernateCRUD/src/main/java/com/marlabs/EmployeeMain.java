package com.marlabs;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeMain {
	public static void main(String[] args) {
		String response = null;
		EmployeeDAO dao = new EmployeeDAO();
		
//		Employee emp = new Employee(103,"Vineeth","Manager","Analytics");
//		response = dao.insertEmployee(emp);
//		System.out.println(response);
		
//		Employee emp = new Employee(103,"Manish","Manager", "Accounts");
//		response = dao.updateEmployee(emp);
//		System.out.println(response);
	
//		Employee emp = dao.getEmployee(103);
//		System.out.println(emp);

		response = dao.deleteEmployee(103);
		System.out.println(response);
	}
}
