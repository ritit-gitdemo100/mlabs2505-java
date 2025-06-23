package com.marlabs;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="h6_employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="emp_id")
	int empId;
	String empName;
	String email;
	String phone;
	
	@ManyToMany( cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,	CascadeType.REFRESH})
	@JoinTable(name="emp_project",
	joinColumns=@JoinColumn(name="empid"),
	inverseJoinColumns=@JoinColumn(name="prjid"))
	private List<Project> projects;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String empName, String email, String phone, List<Project> projects) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.email = email;
		this.phone = phone;
		this.projects = projects;
	}

	public Employee(String empName, String email, String phone, List<Project> projects) {
		super();
		this.empName = empName;
		this.email = email;
		this.phone = phone;
		this.projects = projects;
	}

	public Employee(String empName, String email, String phone) {
		super();
		this.empName = empName;
		this.email = email;
		this.phone = phone;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", email=" + email + ", phone=" + phone + "]";
	}

	
}
