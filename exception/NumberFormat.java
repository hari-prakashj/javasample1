package com.onesoft.exception;

public class NumberFormat {

	public static void main(String[] args) {
		String numpl = "TN99";
		try {
			//String numpl = "99";
			int a = Integer.parseInt(numpl);
			System.out.println(a);
		}
		catch (NumberFormatException nf) {
			System.out.println("aaaadsfsf");
		}

	}

}
