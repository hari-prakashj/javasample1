package com.onesoft.day6;

public class miniArrayWithCondition {

	public static void main(String[] args) {
		int[] a= {10,25,87,63,54,11,93,2};
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		System.out.println(min);

	}

}
