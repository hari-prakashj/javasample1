package com.onesoft.day10;

public class Student {
	String name;
	int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String toString () {
		return name+" "+age;
	}

}
