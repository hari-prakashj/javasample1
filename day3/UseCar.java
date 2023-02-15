package com.onesoft.day3;

public class UseCar {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.brand = "ford";
		car1.model = "ikon";
		car1.price = 1000;
		car1.isPetrol = true;
		
		Car car2 = new Car();
		car2.brand = "mahindra";
		car2.model = "xuv";
		car2.price = 2000;
		car2.isPetrol = false;
		
		Car car3 = new Car();
		car3.brand = "maruti";
		car3.model = "alto";
		car3.price = 500;
		car3.isPetrol = true;
		
		// length of car brand names
		int length = car1.brand.length();
		System.out.println(length);
		
		int length1 = car2.brand.length();
		System.out.println(length1);
		
		int length2 = car3.brand.length();
		System.out.println(length2);
		
		//total price of three cars
		int total = car1.price+car2.price+car3.price;
		System.out.println(total);
		
		// brand names in uppercase
		String upper = car1.brand.toUpperCase();
		System.out.println(upper);
		
		String upper1 = car2.brand.toUpperCase();
		System.out.println(upper1);
		
		String upper2 = car3.brand.toUpperCase();
		System.out.println(upper2);

	}

}
