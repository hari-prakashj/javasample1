package com.onesoft.day10;

public class UseBank {

	public static void main(String[] args) {
		Bank b1 = new Bank();
		
		System.out.println(b1.loanAvailability("hari"));
		System.out.println(b1.loanAvailability("hari",10000));
		System.out.println(b1.loanAvailability("hari",10000,2));

	}

}
