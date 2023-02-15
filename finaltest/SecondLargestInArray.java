package com.onesoft.finaltest;

import java.util.Arrays;
import java.util.Collections;

public class SecondLargestInArray {
	public static void main(String[]args) {
		Integer [] a= {10,90,50,20,40,80,30,60,70};
		
		//int temp;
		Arrays.sort(a,Collections.reverseOrder(a));
		Arrays.sort(a);
		int res = a[a.length-2];
		System.out.println(Arrays.toString(a));
		System.out.println(res);
//		for(int i=0;i<a.length;i++) {
//			for(int j=i+1;j<a.length;j++) {
//				if(a[i]>a[j]) {
//					temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//			}
//		}
//		System.out.println(a[a.length-2]);
	}

}

