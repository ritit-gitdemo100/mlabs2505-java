package com.marlabs;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="h6_project")
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int prjid;
	private String title;
	
	@ManyToMany(cascade= {
			CascadeType.PERSIST,
			CascadeType.MERGE,
			CascadeType.DETACH,
			CascadeType.REFRESH})
	@JoinTable(name="emp_project",
	joinColumns=@JoinColumn(name="prjid"),
	inverseJoinColumns=@JoinColumn(name="empid"))
	private List<Employee> employees;

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int prjid, String title, List<Employee> employees) {
		super();
		this.prjid = prjid;
		this.title = title;
		this.employees = employees;
	}

	public Project(String title, List<Employee> employees) {
		super();
		this.title = title;
		this.employees = employees;
	}

	public Project(String title) {
		super();
		this.title = title;
	}

	public int getPrjid() {
		return prjid;
	}

	public void setPrjid(int prjid) {
		this.prjid = prjid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Project [prjid=" + prjid + ", title=" + title + "]";
	}

	
	
}
