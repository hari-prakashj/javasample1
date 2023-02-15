package com.onesoft.day6;

public class IntegerArray {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		numbers[0] = 100;
		numbers [1] = 50;
		numbers[2] = 75;
		numbers [3] = 66;
		numbers [4] = 34;
		for(int i=numbers.length-1;i>=0;i--) {
			System.out.println(numbers[i]);
		}

	}

}
