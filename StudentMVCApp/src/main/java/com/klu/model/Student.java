package com.klu.model;

public class Student {
	private int id;
	private String name;
	private String course;
	public Student() {
		
	}
	public Student(int id, String name, String course) {
		this.id=id;
		this.name=name;
		this.course=course;
	}
	public int getId() {
		return id;
	}
	public void setId() {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName() {
		this.name=name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse() {
		this.course=course;
	}
	
}
