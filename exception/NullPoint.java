package com.onesoft.exception;

public class NullPoint {

	public static void main(String[] args) {
		String name = null;
		try {
		System.out.println(name.toUpperCase());
		}
		catch (NullPointerException np){
			System.out.println("ddddd");
		}

	}

}
