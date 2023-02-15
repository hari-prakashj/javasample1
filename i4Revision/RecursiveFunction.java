package com.onesoft.i4Revision;

public class RecursiveFunction {
	 static int count=0;
	static void name() {
		
		if(count<=10) {
		System.out.println("hello");
		count++;
		name();
		
	}}
	

	public static void main(String[] args) {
	
		name();
	
	}

}

