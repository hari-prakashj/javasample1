package com.onesoft.day5;

public class PrintVowels {

	public static void main(String[] args) {
		String name="hariprakash";
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u') {
				System.out.println(name.charAt(i));
			}
		}

	}

}
