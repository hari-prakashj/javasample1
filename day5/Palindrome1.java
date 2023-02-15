package com.onesoft.day5;

public class Palindrome1 {

	public static void main(String[] args) {
		String a="racecar";
		String b="";
		for(int i=a.length()-1;i>=0;i--) {
			b=b+a.charAt(i);
		}
		if(a.equals(b) ) {
			System.out.println("It Is A Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}

	}

}
