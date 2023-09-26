package com.constructor.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	
	private String fullname;
	private Course course;
	
	
	public Student(Course course) {
		super();
		this.course = course;
	}
	
	public String getFullname() {
		return fullname;
	}
	public Course getCourse() {
		return course;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public void setCourse(Course course) {
		this.course = course;
	}

	
	
}
