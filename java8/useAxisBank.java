package com.onesoft.java8;

public class useAxisBank {

	public static void main(String[] args) {
		System.out.println(Bank.loan(10000, 1000));
		AxisBank ab1 = new AxisBank();
		System.out.println(ab1.interest(10000));
		System.out.println(ab1.bankLocation("Trichy"));
		System.out.println();

	}

}
