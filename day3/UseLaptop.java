package com.onesoft.day3;

public class UseLaptop {

	public static void main(String[] args) {
		Laptop laptop1 = new Laptop();
		laptop1.brand = "Dell";
		laptop1.price = 1000;
		laptop1.color = "black";
		laptop1.isWarranty = true;
		
		// convert brand to upper case
		String upper = laptop1.brand.toUpperCase();
		System.out.println(upper);
		
		//length of the brand
		int length = laptop1.brand.length();
		System.out.println(length);
		
		//brand name startswith "D"
		Boolean start = laptop1.brand.startsWith("D");
		System.out.println(start);
		
		//last character of the brand name
		char last = laptop1.brand.charAt(laptop1.brand.length()-1);
		System.out.println(last);
		
		// convert brand name and color to lower case
		

	}

}
