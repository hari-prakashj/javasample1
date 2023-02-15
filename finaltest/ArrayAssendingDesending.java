package com.onesoft.finaltest;

import java.util.Arrays;

public class ArrayAssendingDesending {
	public static void main(String[]args) {
		int[] a = {60,20,350,4,50,60,170,80,190};
		int[] b = {1,2,3,4,5,6,7,8,9};
		int[] assending = new int[a.length];
		int[] desending = new int [a.length];
		Arrays.sort(a);
		int z=0;
		for(int i=0;i<a.length;i++) {
		assending[i]=a[i];
		}
		System.out.println(Arrays.toString(assending));
		
		
		for(int j=b.length-1;j>=0;j--) {
			desending[z++]=b[j];
		}
		System.out.println(Arrays.toString(desending));
		}

}
