package com.onesoft.java8;

public class UseMaxMin {

	public static void main(String[] args) {
		Methods method = new Methods();
		MaxMin findMaximum = method::findMax;
		int[]num = {10,15,20,25,30,35,40,45};
		System.out.println(findMaximum.find(num));
		MaxMin findMinimum = Methods::findMin;
		System.out.println(findMinimum.find(num));

	}

}
