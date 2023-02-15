package com.onesoft.day10;

public class SuperBike extends Bike{
	
	public int speed() {
		return 250;
	}
	public static void main(String[]args) {
		SuperBike sb1 = new SuperBike();
	
	System.out.println(sb1.brand+sb1.price+sb1.speed());
	}

}
	