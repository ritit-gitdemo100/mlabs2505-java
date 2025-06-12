package demo.task2;

public class Employee {
	
	private int empId;
	private String name;
	private String dept;
	private String username;
	private String password;
	
	public Employee(int empId, String name, String dept, String username, String password) {
		super();
		this.empId = empId;
		this.name = name;
		this.dept = dept;
		this.username = username;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getEmpId() {
		return empId;
	}

	public String getUsername() {
		return username;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
