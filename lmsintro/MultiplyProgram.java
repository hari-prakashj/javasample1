package com.onesoft.lmsintro;

public class MultiplyProgram {

	public static void main(String[] args) {
		String a = args[0];
		String b = args[1];
		String c = args[2];
		
		float num1 = Float.parseFloat(a);
		float num2 = Float.parseFloat(b);
		float num3 = Float.parseFloat(c);
		
		System.out.println(num1*num2*num3);

	}

}
