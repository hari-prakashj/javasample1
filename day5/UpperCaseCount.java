package com.onesoft.day5;

public class UpperCaseCount {

	public static void main(String[] args) {
		String name = "HaRiPrAkAsH";
		int total = 0;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)>='A'&&name.charAt(i)<='Z') {
				total=total+1;
			}
		}
		System.out.println(total);
	}

}
