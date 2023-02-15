package com.onesoft.day5;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 7;
		boolean check=true;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				check=false;
			}
		}
		if(check) {
			System.out.println("It is Prime Number");
		}
		else {
			System.out.println("Not a Prime Number");
		}

	}

}
