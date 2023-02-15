package com.onesoft.java8;

public interface Bank {
	public static int loan(int assetAmount, int salary) {
		//int a = assetAmount/2;
		//int b = salary*10;
		//return a+b;
		return assetAmount/2+salary*10;
	}
	public default  int interest(int principleAmount) {
		return principleAmount*10/100;
	}
	public String bankLocation(String location);

}
