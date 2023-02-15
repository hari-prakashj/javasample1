package com.onesoft.lmsintro;

public class UseSaree {

	public static void main(String[] args) {
		String[] a = args[0].split(",");
		
		Saree s1 = new Saree();
		s1.material = a[0].toUpperCase();
		s1.color = a[1].toUpperCase();
		s1.price = Integer.parseInt(a[2]);
		s1.discountPercentage = Integer.parseInt(a[3]);
		int tax = (s1.price*s1.discountPercentage/100);
		s1.netPrice = (s1.price-tax);
		
		System.out.println("Material="+s1.material+" Color="+s1.color+" NetPrice="+s1.netPrice);
		
	}

}
class Saree{
	String material;
	String color;
	int price;
	int discountPercentage;
	int netPrice;
}
