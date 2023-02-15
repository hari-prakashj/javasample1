package com.onesoft.day4;

public class UseMobile {

	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		m1.brand = "oneplus";
		m1.price = 1000;
		m1.color = "black";
		Mobile m2 = new Mobile();
		m2.brand = "vivo";
		m2.price = 1500;
		m2.color = "white";
		Mobile m3 = new Mobile();
		m3.brand = "oppo";
		m3.price = 2000;
		m3.color ="green";
		if(m1.price>m2.price&&m1.price>m3.price) {
			System.out.println("Brand:"+m1.brand+", Price:"+m1.price+", Color:"+m1.color);
		}
		else if(m2.price>m1.price&&m2.price>m3.price) {
			System.out.println("Brand:"+m2.brand+", Price:"+m2.price+", Color:"+m2.color);
		}
		else if(m3.price>m1.price&&m3.price>m2.price) {
			System.out.println("Brand:"+m3.brand+", Price:"+m3.price+", Color:"+m3.color);
		}
		else {
			System.out.println("Invalid Input");
		}
	}

}
class Mobile {
	String brand;
	int price;
	String color;
}
