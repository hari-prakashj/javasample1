package com.onesoft.lmsintro;

public class AdditionProgram {

	public static void main(String[] args) {
		// comma separator
		String[] a = args[0].split(",");
		
		int num1 = Integer.parseInt(a[0]);
		int num2 = Integer.parseInt(a[1]);
		int num3 = Integer.parseInt(a[2]);
		
		System.out.println(num1+num2+num3);

	}

}
