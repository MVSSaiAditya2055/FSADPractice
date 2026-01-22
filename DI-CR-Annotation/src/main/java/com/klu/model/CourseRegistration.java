package com.klu.model;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CourseRegistration {
	@Value("101")
	
	private int rollno;
	@Value("Aditya")
	private String studentName;
	
	
	private String courseName;
	
	private int semester;
	public CourseRegistration(@Value("FSAD")String cn,@Value("4")int sem) {
		
		courseName=cn;
		semester=sem;
	}
	public void display() {
		System.out.println("Roll Number: "+rollno);
		System.out.println("Student Name: "+studentName);
		System.out.println("Course Name: "+courseName);
		System.out.println("Semester: "+semester);
	}
}
