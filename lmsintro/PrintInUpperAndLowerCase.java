package com.onesoft.lmsintro;

public class PrintInUpperAndLowerCase {

	public static void main(String[] args) {
		String[] a = args[0].split(",");
		
		System.out.println(a[0].toUpperCase());
		System.out.println(a[1].toLowerCase());

	}

}
