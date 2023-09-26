package com.ioc.model;

public class Employee {
	
	private String name;
	private String dept;
	private Address address;
	
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, String dept, Address address) {
		super();
		this.name = name;
		this.dept = dept;
		this.address = address;
	}
	
	public void show() {
		System.out.println("Name: "+ name+"\n"+"Department :"+dept+"\n"+"Address :" + address);
	}
	

}
