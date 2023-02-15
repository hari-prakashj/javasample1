package com.onesoft.day5;

public class OddNumAdd {

	public static void main(String[] args) {
		int total = 0;
		for(int i=10;i<=20;i++) {
			if(i%2!=0) {
				total=total+i;
			}
		}
		System.out.println(total);

	}

}
