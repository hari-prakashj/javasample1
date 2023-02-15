package com.onesoft.finaltest;

public class FibinocciSeries {
	public static void main(String[]args) {
		int a =10;
		int num1 = 0;
		int num2 =1;
		System.out.println(num1);
		for(int i=2;i<=a;i++) {
			int num3 = num1+num2;
			System.out.println(num3);
			num1=num2;
			num2=num3;
		}
	}

}
