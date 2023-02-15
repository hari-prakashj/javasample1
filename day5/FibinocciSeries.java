package com.onesoft.day5;

public class FibinocciSeries {

	public static void main(String[] args) {
		int num1= 0;
		int num2=1;
		int total =0;
		for(int i=2;i<=10;i++) {
			int num3=num1+num2;
			//System.out.println(num3);
			total=total+num3;
			System.out.println(num3);
			num1=num2;
			num2=num3;
			
		}
		System.out.println(total);
	}

}
