package com.klu.model;

public class CourseRegistration {
	private int rollno;
	private String studentName;
	private String courseName;
	private int semister;
	public CourseRegistration(int rollno,String studentName) {
		this.rollno=rollno;
		this.studentName=studentName;
	}
	public void setCourseName(String courseName) {
		this.courseName=courseName;
	}
	public void setSemister(int semister) {
		this.semister=semister;
	}
	public void display() {
		System.out.println("RollNo : "+rollno);
		System.out.println("Name: "+studentName);
		System.out.println("CourseName: "+courseName);
		System.out.println("Semister: "+semister);
		
	}

}
