package com.model;

public class Student {
	
	private String name;
	private int number;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}
	public void show() {
		
		System.out.println("Name :"+ name+" "+"Number :"+number);
	}

}
