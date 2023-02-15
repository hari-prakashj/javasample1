package com.onesoft.day2;

public class BikeMethod {

	public static void main(String[] args) {
		Bike b = new Bike();
		b.brand = "hero";
		b.model = "splendor";
		b.price = 1000;
		b.cc = 110;
		b.tax = 10;
		b.netPrice = b.getNetPrice();
		b.printBike();

	}

}
class Bike{
	String brand;
	String model;
	int price;
	int cc;
	int tax;
	int netPrice;
	
	public void printBike() {
		System.out.println(brand+","+model+","+price+","+cc+","+tax+","+netPrice);
	}
	public int getNetPrice() {
		return price+(price*tax/100);
	}
}
