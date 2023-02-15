package com.onesoft.day10;

public class SmartMobile extends Mobile{
	boolean isTouch;
	String os;
	int ram;
	String networkType;
	
	public SmartMobile(String brand, boolean isCamera, int noOfSim, boolean isTouch, String os, int ram, String networkType) {
		super(brand,isCamera,noOfSim);
		this.isTouch = isTouch;
		this.os = os;
		this.ram = ram;
		this.networkType = networkType;
	}
	public String toString() {
		return super.toString()+" "+isTouch+" "+os+" "+ram+" "+networkType;
	}

}
