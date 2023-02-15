package com.onesoft.day6;

public class ReverseArray1 {

	public static void main(String[] args) {
		int[] num = {100,200,50,70,92,-80,63,-10};
		
		for(int i=(num.length-1)/2;i>=0;i--) {
			System.out.println(num[i]);
		}

	}

}
