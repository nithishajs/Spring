package com.e.model;

public class Employee {
	
	private int eid;
	private String name;
	private String dept;
	private float salary;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
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
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public Employee(int eid, String name, String dept, float salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	
	public Employee(String name, String dept, float salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	} 
	
	

}
