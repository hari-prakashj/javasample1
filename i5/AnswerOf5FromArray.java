package com.onesoft.i5;

public class AnswerOf5FromArray {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8};
		
		for(int i=0;i<a.length;i++) {
			//System.out.println(a[i]);
			for(int j=0;j<a.length;j++) {
				if(a[i]+a[j]==5) {
					System.out.print(a[i]);
					System.out.print(a[j]+" ");
				}
			}
		}
		

	}

}
