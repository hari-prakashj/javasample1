package com.onesoft.day12;

public class Student {
	private String name;
	private int rollNumber;
	private String grade;
	private boolean isPresent;
	
	public void setName(String name) {
		this .name=name;
	}
	public String getName() {
		return name;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber=rollNumber;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String gerGrade() {
		return grade;
	}
	public void setIsPresent(boolean isPresent) {
		this.isPresent=isPresent;
	}
	public boolean getIsPresent() {
		return isPresent;
	}
	
	public Student(String name, int rollNumber, String grade, boolean isPresent) {
		this.name=name;
		this.rollNumber=rollNumber;
		this.grade=grade;
		this.isPresent=isPresent;
	}
	
	public String toString() {
		return name+rollNumber+grade+isPresent;
	}

}
