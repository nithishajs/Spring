package com.bytype.model;

import org.springframework.beans.factory.annotation.Autowired;

public class City {
	
	private int id;
	private String name;
	private State s;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String string) {
		this.name = string;
	}
	public State getS() {
		return s;
	}

	@Autowired 
	//Marks a constructor, field, setter method or config method as to beautowired 
	//by Spring's dependency injection facilities. 
	public void setS(State s) {
		this.s = s;
	}
	public void showCitYDetails() {
		System.out.println("City Id :"+id);
		System.out.println("City Name : " + name);
		System.out.println("State : " + s.getName());
	}
	

}
