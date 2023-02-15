package com.onesoft.java8;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = sc.next();
		System.out.println("Enter age:");
		int age=sc.nextInt();
		System.out.println("Enter phone Number:");
		long phonenumber = sc.nextLong();
		System.out.println(name+" "+age+" "+phonenumber);
	}

}
