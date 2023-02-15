package com.onesoft.day11;

public class UseBus {

	public static void main(String[] args) {
		Bus b1 = new Bus();
		System.out.println(b1.mode("Bus")+" "+b1.powerSource("Diesel")+" "+b1.capacity(50)+" "+b1.fare()+" "+b1.kms(800)+" "+b1.isLuxurious()+" "+b1.number(1994)+" "+b1.brand("volvo"));
	}

}
