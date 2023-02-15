package com.onesoft.day9;

public class UseEmployee {
	public static void main(String[]args) {
		Address ad1 = new Address();
		ad1.doorNo = 10;
		ad1.streetName = "Health Colony";
		ad1.pincode = 620012;
		
		Employee e1 = new Employee();
		e1.id = 001;
		e1.name = "Hari Prakash";
		e1.age = 28;
		e1.gender = "male";
		e1.address = ad1;
		
		System.out.println(e1.id+e1.name+e1.age+e1.gender+e1.address.streetName);
	}

}
