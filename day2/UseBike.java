package com.onesoft.day2;

public class UseBike {
	public static void main(String[]args) {
		BikeDetails b1 = new BikeDetails();
		b1.brand = "Royal Enfield";
		b1.price = 1000;
		b1.model = "Classic 350";
		b1.cc = 350;
		b1.tax = 10;
		int taxable1 = (b1.price*b1.tax/100);
		System.out.println(taxable1);
		b1.netPrice = (b1.price+taxable1);
		System.out.println(b1.netPrice);
		
		BikeDetails b2 = new BikeDetails();
		b2.brand = "Honda";
		b2.price = 500;
		b2.model = "Shine";
		b2.cc = 125;
		b2.tax = 10;
		int taxable2 = (b2.price*b2.tax/100);
		System.out.println(taxable2);
		b2.netPrice = (b2.price+taxable2);
		System.out.println(b2.netPrice);
		
		BikeDetails b3 = new BikeDetails();
		b3.brand = "Yamaha";
		b3.price = 10000;
		b3.model = "R15";
		b3.cc = 150;
		b3.tax = 10;
		int taxable3 = (b3.price*b3.tax/100);
		System.out.println(taxable3);
		b3.netPrice = (b3.price+taxable3);
		System.out.println(b3.netPrice);
	}

}
class BikeDetails{
	String brand;
	int price;
	String model;
	int cc;
	int tax;
	float netPrice;
}
