package com.onesoft.day6;

public class TotalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] num = {100,200,50,70,92,-80,63,-10};
		int total=0;
		int count =0;
		
		for(int i=0;i<num.length;i++) {
			total = total+num[i];
			count=count+1;
		}
		System.out.println(total);
		System.out.println(total/count);
	}

}
