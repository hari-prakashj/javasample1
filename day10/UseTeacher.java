package com.onesoft.day10;

public class UseTeacher {

	public static void main(String[] args) {
		Teacher t1 = new Teacher();
		t1.name = "hari";
		t1.age = 28;
		t1.gender = "male";
		t1.designation = "developer";
		t1.salary = 10000;
		t1.experience = 2;
	
		
		System.out.println("Name: "+t1.name+", Age: "+t1.age+", Gender: "+t1.gender+", Designation: "+t1.designation+", Salary: "+t1.salary+", Experience: "+t1.experience+", Times: "+t1.eat());

	}

}
