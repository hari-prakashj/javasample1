package com.onesoft.day6;

public class ReverseStringArray {

	public static void main(String[] args) {
		String[] name= {"franklin","revathi","mani","hari","prakash"};
		String total="";
		
		for(int i=name.length-1;i>=0;i--) {
			total=total+name[i]+",";
		}
		System.out.println(total);

	}

}
