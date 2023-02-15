package com.onesoft.java8;

public interface Calculator {
	public int math (int a, int b);
	public static void operation() {
		System.out.println("This file performs calculation");
	} 
	public default void define () {
		System.out.println("add,sub,mul,div,modulus");
	}

}
