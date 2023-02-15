package com.onesoft.day11;

public class TouchLaptop extends Laptop{
	public int price(int price) {
		return price;
	}
	public int ram(int ram) {
		return ram;
	}
	public float ratting(float ratting) {
		return ratting;
	}
	public static void main(String[]args) {
		TouchLaptop t1 = new TouchLaptop();
		System.out.println(t1.brand()+" "+t1.model("inspiration123")+" "+t1.price(10000)+" "+t1.ram(6)+" "+t1.ratting(4.7f));
	}

}
