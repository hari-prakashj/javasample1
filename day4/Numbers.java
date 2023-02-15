package com.onesoft.day4;

public class Numbers {

	public static void main(String[] args) {
		int num1 = 550;
		int num2 = 110;
		int num3 = 880;
		
		if(num1>num2&&num1>num3) {
			System.out.println("num 1 is greater");
		}
		else if(num2>num1&&num2>num3) {
			System.out.println("num 2 is greater");
		}
		else if(num3>num1&&num3>num2) {
			System.out.println("num 3 is greater");
		}
		else {
			System.out.println("INVALID INPUT");
		}

	}

}
