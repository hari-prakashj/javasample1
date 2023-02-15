package com.onesoft.day9;

public class Compressor {
	int power;
	String shape;
	String gas;
	
	public void setPower(int a) {
		power = a;	
	}
	public int getPower() {
		return power;
	}
	public void setShape(String b) {
		shape=b;
	}
	public String getshape() {
		return shape;
	}
	public void setGas(String c) {
		gas=c;
	}
	public String getGas() {
		return gas;
	}
	
	public Compressor (int power, String shape, String gas) {
		power=power;
		shape = shape;
		gas = gas;
	}

}
