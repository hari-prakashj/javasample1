package com.onesoft.finaltest;

public class Palindrome {
	public static void main(String[]args) {
		String a = "hari";
		String b = "";
		for(int i=a.length()-1;i>=0;i--) {
			b=b+a.charAt(i);
		}
		if(a.equalsIgnoreCase(b)) {
			System.out.println("It is a Palindrome");
		}
		else {
			System.out.println("It is not a Palindrome");
		}
	}

}
