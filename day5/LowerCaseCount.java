package com.onesoft.day5;

public class LowerCaseCount {

	public static void main(String[] args) {
		String name = "HaRiPrAkAsH";
		int total = 0;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)>='a'&&name.charAt(i)<='z') {
				total=total+1;
			}
		}
		System.out.println(total);

	}

}
