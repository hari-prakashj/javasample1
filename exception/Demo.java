package com.onesoft.exception;

public class Demo {

	public static void main(String[] args) {
		int a=10;
		int b=5;
		int c=0;
		
		System.out.println(a/b);
		try {
			System.out.println(a/c);
		}
		catch (ArithmeticException ae) {
			System.out.println("aaaaaa");
			//for location
			ae.printStackTrace();   
		}
		finally {
			System.out.println("finally message");
		}
		System.out.println(a+b);
	}

}
