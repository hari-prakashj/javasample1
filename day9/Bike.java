package com.onesoft.day9;

public class Bike {
	private String brand;
	private String model;
	private int price;
	private Brake brake;
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrake(Brake brake) {
		this.brake = brake;
	}
	public Brake getBrake() {
		return this.brake;
	}
	public void setModel (String model) {
		this.model = model;
	}
	public String getModel() {
		return model;
	}
	public  void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}

}
