package com.onesoft.i3;

public class Stringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str = new StringBuilder();
		str.append("Hello");
		System.out.println(str.toString());
		
		StringBuilder str1 = new StringBuilder("AABBCCDDEEFF");
		System.out.println(str1.toString());
		
		StringBuilder str2 = new StringBuilder(10);
		System.out.println(str2.capacity());
		
		StringBuilder str3 = new StringBuilder(str1.toString());
		System.out.println(str3.toString());
          
		System.out.println(str1.appendCodePoint(12));
		
		

	}

}
