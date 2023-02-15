package com.onesoft.day7;

public class UseBike {

	public static void main(String[] args) {
		Bike bike1 = new Bike();
		bike1.brand = "hero";
		bike1.model = "pleasure";
		bike1.price = 1000;
		bike1.isElectric = true;
		Bike bike2 = new Bike();
		bike2.brand = "honda";
		bike2.model = "shine";
		bike2.price = 1500;
		bike2.isElectric = false;
		Bike bike3 = new Bike();
		bike3.brand ="Royal Enfield";
		bike3.model = "clasic";
		bike3.price = 2000;
		bike3.isElectric = false;
		
		Bike[] bikes = new Bike[3];
		bikes[0] = bike1;
		bikes[1]= bike2;
		bikes[2] = bike3;
		
		for(int i=0;i<bikes.length;i++) {
			System.out.println(bikes[i].brand+","+bikes[i].model+","+bikes[i].price+","+bikes[i].isElectric);
		}

	}

}
 class Bike {
	String brand;
	String model;
	int price;
	boolean isElectric;
}
