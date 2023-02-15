package com.onesoft.day5;

public class EvenPositionString {

	public static void main(String[] args) {
		String name="HARIPRAKASH";
		for(int i=0;i<name.length();i++) {
			if(i%2==0) {
			System.out.println(name.charAt(i));
			}
		}

	}

}
