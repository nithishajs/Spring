package com.byname.model;

public class A {
	
	private B b;

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}
	
	A(){
		System.out.println("A is created");
	}
	
	public void show() {
		System.out.println("Hello A");
		b.show();
	}
	
	

}
