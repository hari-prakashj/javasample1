package com.onesoft.day8;

public class UseBike {

	public static void main(String[] args) {
		Bike bike1 = new Bike();
		bike1.brand = "Royal Enfield";
		bike1.price = 100000;
		bike1.color = "Black";
		bike1.isNewVersion = true;
		
		System.out.println(bike1.brand+" "+bike1.findNetPrice(bike1.price, 10));
		
		Bike bike2 = new Bike();
		bike2.brand = "Honda";
		bike2.price = 150000;
		bike2.color = "Red";
		bike2.isNewVersion = true;
		
		System.out.println(bike2.brand+" "+bike2.findNetPrice(bike2.price, 10));

	}

}
class Bike {
	String brand;
	int price;
	String color;
	boolean isNewVersion;

	
	String findNetPrice(int a,int b) {
		return "NetPrice is"+ ((a*b/100)+a);
	}
}