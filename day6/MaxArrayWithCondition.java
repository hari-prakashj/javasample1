package com.onesoft.day6;

public class MaxArrayWithCondition {

	public static void main(String[] args) {
		int [] integer= {10,25,87,361,54,100,93,72};
		int max=integer[0];
		for(int i=0;i<integer.length;i++) {
			if(max<integer[i]) {
				max=integer[i];
			}
		}
		System.out.println(max);

	}

}
