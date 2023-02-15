package com.onesoft.day10;

public class Mobile {
	String brand;
	boolean isCamera;
	int noOfSim;
	
	public Mobile(String brand, boolean isCamera, int noOfSim) {
		this.brand = brand;
		this.isCamera = isCamera;
		this.noOfSim = noOfSim;
	}
	public String toString() {
		return brand+" "+isCamera+" "+noOfSim;
	}
	

}
