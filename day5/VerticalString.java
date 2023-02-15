package com.onesoft.day5;

public class VerticalString {

	public static void main(String[] args) {
		String name = "HARI PRAKASH";
//		for(int i=0;i<name.length();i++) {
//			System.out.println(name.charAt(i));
//		}
		for(int i=name.length()-1;i>=0;i--) {
			System.out.println(name.charAt(i));
		}

	}

}
