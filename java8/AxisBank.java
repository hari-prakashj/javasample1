package com.onesoft.java8;

public class AxisBank implements Bank {
	public int interest(int principleAmount) {
		return principleAmount*20/100;
	}
	public String bankLocation(String location) {
		return location;
	}

}
