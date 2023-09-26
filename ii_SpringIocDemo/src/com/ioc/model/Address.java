package com.ioc.model;

public class Address {
	
	private String state;
	private String City;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	
	public Address(String state, String city) {
		super();
		this.state = state;
		City = city;
	}
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [state=" + state + ", City=" + City + "]";
	}
	
	
	
	

}
