package com.Spring.DependencyInjection.School;

public class Student {
	
	private String studentName;
	private int studentId;
	private char studentSection;
	private int studentAge;
	
	public Student(int studentAge) {
		this.studentAge = studentAge;
	}

	public Student(int studentAge, char studentSection) {
		this.studentAge = studentAge;
		this.studentSection = studentSection;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public void studentInfo() {
		System.out.println("{Student name: " + studentName + ", Student ID: " + studentId + ", Student Section: " + studentSection + ", Student Age: "
				+ studentAge + "}"); 
	}

}
