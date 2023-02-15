package com.onesoft.finaltest;

public class ArmStrongNumber {
	public static void main(String[]args) {
		int num=153, number, remainder;
		number=num;
		int result =0;
		//double result = 0d;
		while(number!=0) {
			remainder = number%10;
			System.out.println("remainder "+remainder);
			//result = result+(remainder*remainder*remainder);
			result +=Math.pow(remainder, 3);
			number = number/10;
			System.out.println("number "+number);
		}
		if(result == num) {
			System.out.println(num+" is a ArmStrong Number");
		}
		else {
			System.out.println(num+" is not a ArmStrong Number");
		}
	}

}
