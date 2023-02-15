package com.onesoft.java8;

public interface Ac1 {
	public int findNetPrice(int price, int tax, int discount);
	public default String printObject() {
		return "This object is AC";
	}

}
