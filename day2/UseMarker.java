package com.onesoft.day2;

public class UseMarker {
	public static void main(String[]args) {
		// classname reference = new classname();
		Marker m1 = new Marker();
		m1.brand = "Flair";
		m1.price = 20;
		m1.colour = "Red";
		m1.height = 15.5f;
		m1.tipSize = 0.8f;
		
		System.out.println(m1.brand+","+m1.price+","+m1.colour+","+m1.height+","+m1.tipSize);
	}

}


