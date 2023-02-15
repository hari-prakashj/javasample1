package com.onesoft.finaltest;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 7;
		boolean check = true;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				check=false;
			}
		}
		if(check) {
			System.out.println(num+" is a Prime Number");
		}
		else {
			System.out.println(num+" is not a Prime Number");
		}

	}

}
