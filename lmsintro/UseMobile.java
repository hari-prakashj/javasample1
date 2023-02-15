package com.onesoft.lmsintro;

public class UseMobile {

	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		m1.brand = args[0];
		m1.price = Integer.parseInt(args[1]);
		m1.color = args[2];
		m1.isWarranty = Boolean.parseBoolean(args[3]);
		
		Mobile m2 = new Mobile();
		m2.brand = args[4];
		m2.price = Integer.parseInt(args[5]);
		m2.color = args[6];
		m2.isWarranty = Boolean.parseBoolean(args[7]);
		
		System.out.println("Brand="+m1.brand+" Price="+m1.price+" Color="+m1.color+" IsWarranty="+m1.isWarranty);
		System.out.println("Brand="+m2.brand+" Price="+m2.price+" Color="+m2.color+" IsWarranty="+m2.isWarranty);
		
		

	}

}
class Mobile{
	String brand;
	int price;
	String color;
	boolean isWarranty;
	
}
