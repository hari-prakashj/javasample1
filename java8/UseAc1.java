package com.onesoft.java8;

public class UseAc1 {

	public static void main(String[] args) {
		Ac1 amount = (a,b,c)-> a+b-c;
		System.out.println("The Total Amount is= "+amount.findNetPrice(1000, 100, 20));
		Ac1 percent = (a,b,c) -> a+a*b/100-a*c/100;
		System.out.println("The Total is= "+percent.findNetPrice(1000, 10, 20));
		System.out.println(amount.printObject());

	}

}
