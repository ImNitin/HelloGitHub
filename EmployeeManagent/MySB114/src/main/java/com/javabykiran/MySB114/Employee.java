package com.javabykiran.MySB114;

public class Employee {

	
	Employee(){}
	
   	int empId;
	String name;
	String salary;
	String dept;
	String cmp;
	
	public Employee(int empId, String name, String salary, String dept, String cmp) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
		this.cmp = cmp;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getCmp() {
		return cmp;
	}

	public void setCmp(String cmp) {
		this.cmp = cmp;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", dept=" + dept + ", cmp=" + cmp
				+ "]";
	}
	
	
	
}
