package com.onesoft.java8;

public interface Furniture {
	public default String printMaterial(String material) {
		return "This Material is="+material;
	}
	public default String printPrice(int price) {
		return "The price is="+price;
	}

}
