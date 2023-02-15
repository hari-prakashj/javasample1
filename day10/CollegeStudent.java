package com.onesoft.day10;

public class CollegeStudent extends Student {
	String degree;
	boolean isUniform;
	
	public CollegeStudent(String name, int age, String degree, boolean isUniform) {
		super(name,age);
		this.degree= degree;
		this.isUniform = isUniform;
	}
	public String toString() {
		return super.toString()+" "+degree+" "+ isUniform;
	}

}
