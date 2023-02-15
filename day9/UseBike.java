package com.onesoft.day9;

public class UseBike {

	public static void main(String[] args) {
		Brake b1 = new Brake();
		b1.setPrice(1500);
		b1.setType("Disk");
		
		Bike bike1 = new Bike();
		bike1.setBrand("RoyalEnfield");
		bike1.setModel("Classic");
		bike1.setPrice(150000);
		bike1.setBrake(b1);
		
		//System.out.println(bike1.getBrand()+bike1.getModel()+bike1.getPrice()+bike1.getBrake().getType());
         System.out.println(bike1);
	}

}
