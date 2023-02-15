package com.onesoft.function;

public class UseBike {

	public static void main(String[] args) {
		Bike bike1 = new Bike();
		bike1.brand = "honda";
		bike1.price = 1000;
		bike1.color = "black";
		bike1.isPetrolType = true;
		
		Bike bike2 = new Bike();
		bike2.brand = "royal enfield";
		bike2.price = 1500;
		bike2.color = "white";
		bike2.isPetrolType = false;
		
		Bike bike3 = new Bike();
		bike3.brand = "hero";
		bike3.price = 1200;
		bike3.color = "red";
		bike3.isPetrolType = true;
		
		Bike bike4 = new Bike();
		bike4.brand = "indian";
		bike4.price = 10000;
		bike4.color = "blue";
		bike4.isPetrolType = false;
		
		Bike[] bikes = new Bike[4];
		bikes[0] = bike1;
		bikes[1] = bike2;
		bikes[2] = bike3;
		bikes[3] = bike4;
		
		bike1.show();
		bike2.findbrand(bikes).show();
		bike3.findprice(bikes).show(); 

	}

}
class Bike {
	String brand;
	int price;
	String color;
	boolean isPetrolType;
	public void show() {
		
		System.out.println("BRAND="+brand+", PRICE="+price+", COLOR="+color+", IsPetrolType"+isPetrolType);
	}
	public Bike findbrand(Bike[] a) {
		int max = a[0].brand.length();
		Bike b1=a[0];
		for(int i=0;i<a.length;i++) {
			if(max<a[i].brand.length()) {
				max=a[i].brand.length();
				b1=a[i];
			}
		}
		return b1;
	}
	public Bike findprice(Bike[]a) {
		int max = a[0].price;
		Bike b2 = a[0];
		for(int i=0;i<a.length;i++) {
			if(max<a[i].price) {
				max = a[i].price;
				b2 = a[i];
			}
		}
		return b2;
	}
}