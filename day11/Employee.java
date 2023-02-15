package com.onesoft.day11;

public class Employee implements Human{
	public String name() {
		return "hari";
	}
	public int age(int year) {
		return 2023 - year;
	}
	public String gender(String g) {
		return g;
	}
	public static void main(String []args) {
		Employee e1 = new Employee();
		System.out.println(e1.name()+e1.age(1994)+e1.gender("male"));
	}

}
