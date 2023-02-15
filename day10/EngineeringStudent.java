package com.onesoft.day10;

public class EngineeringStudent extends CollegeStudent {
	String dept;
	int id;
	
	public EngineeringStudent(String name, int age, String degree, boolean isUniform, String dept, int id) {
		super(name,age,degree,isUniform);
		this.dept = dept;
		this.id = id;
	}
	public String toString() {
		return super.toString()+" "+dept+" "+id;
	}

}
