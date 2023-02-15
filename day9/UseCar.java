package com.onesoft.day9;

public class UseCar {

	public static void main(String[] args) {
		Engine e1 = new Engine();
		e1.cc = 1500;
		e1.fuel = "petrol";
		e1.noOfPiston = 4;
		
		Car c1 = new Car();
		c1.brand = "ford";
		c1.color = "white";
		c1.price = 1000000;
		c1.engine = e1;
		
		System.out.println(c1.brand+c1.color+c1.price+c1.engine.fuel);
	}

}
