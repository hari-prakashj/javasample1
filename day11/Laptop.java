package com.onesoft.day11;

public abstract class Laptop {
	public String brand() {
		return "lenovo";
	}
	public String model(String model) {
		return model;
	}
	abstract public int price(int price);
	abstract public int ram(int ram);
	abstract public float ratting(float ratting);

}
