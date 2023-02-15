package com.onesoft.day2;

public class Car {
	public static void main(String[]args) {
		CarDetails c1 = new CarDetails();
		c1.brand = "Ford";
		c1.price = 1000;
		c1.colour = "White";
		
		CarDetails c2 = new CarDetails();
		c2.brand = "TATA";
		c2.price = 2000;
		c2.colour = "Black";
		
		CarDetails c3 = new CarDetails();
		c3.brand = "Fiat";
		c3.price = 3000;
		c3.colour = "Red";
		
		System.out.println("Total Price = "+(c1.price+c2.price+c3.price));
	}
	

}
//class CarDetails{
//	String brand;
//	int price;
//	String colour;
//	
//}
