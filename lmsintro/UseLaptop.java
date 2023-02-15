package com.onesoft.lmsintro;

public class UseLaptop {

	public static void main(String[] args) {
		String[] a = args[0].split(",");
		String[] b = args[1].split(",");
		
		Laptop l1 = new Laptop();
		l1.brand = a[0];
		l1.price = Integer.parseInt(a[1]);
		l1.color = a[2];
		l1.isTouchScreen = Boolean.parseBoolean(a[3]);
		
		Laptop l2 = new Laptop();
		l2.brand = b[0];
		l2.price = Integer.parseInt(b[1]);
		l2.color = b[2];
		l2.isTouchScreen = Boolean.parseBoolean(b[3]);
		
		System.out.println("Brand:"+l1.brand+" Price:"+l1.price+" Color:"+l1.color+" IsTouchScreen:"+l1.isTouchScreen);
		System.out.println("Brand:"+l2.brand+" Price:"+l2.price+" Color:"+l2.color+" IsTouchScreen:"+l2.isTouchScreen);
		

	}

}
class Laptop{
	String brand;
    int price;
    String color;
    boolean isTouchScreen;
	
}