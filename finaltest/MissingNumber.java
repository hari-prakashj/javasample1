package com.onesoft.finaltest;

public class MissingNumber {

	public static void main(String[] args) {
		int[] a = {1,2,3,5};
		int n = a.length+1;
		int sum = n*(n+1)/2;
	
		int restsum =0;
		for(int i=0; i<a.length;i++) {
			restsum=restsum+a[i];
		}
		int sum3 = sum-restsum;
		System.out.println(sum3);

	}

}
