package com.onesoft.day5;

public class Palindrome {

	public static void main(String[] args) {
		String name ="madam";
		//mom ,dad, racecar,malayalam
		String name1="";
		for(int i=name.length()-1;i>=0;i--) {
			name1=name1+name.charAt(i);
		}
		if(name.equals(name1)) {
			System.out.println("It is a palindrome");
		}
		else {
			System.out.println("It is not a Palindrome");
		}

	}

}
