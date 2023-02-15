package com.onesoft.exception;

public class Exception1 {

	public static void main(String[] args) {
		String name = "hari";
		try {
			System.out.println(name.charAt(6));
		} catch (Exception e) {
			System.out.println("vvvvvvvvvvvvvvvv");
		}
		System.out.println("hari");

	}

}
