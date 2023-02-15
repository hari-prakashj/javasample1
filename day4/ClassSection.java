package com.onesoft.day4;

import java.util.Arrays;

public class ClassSection {

	public static void main(String[] args) {
		String name = "prathimannan";
		if(name.charAt(0)>='a'&&name.charAt(0)<='h') {
			System.out.println(name+" A section");
		}
		else if(name.charAt(0)>='i'&&name.charAt(0)<='n'){
			System.out.println(name+" B section");
		}
		else if(name.charAt(0)>='o'&&name.charAt(0)<='z') {
			System.out.println(name+" C section");
		}
		else {
			System.out.println("Invalid Input");
		}
		
		//int a = name.length();
		//System.out.println(a);
		//System.out.println(name.substring(2,7));
		char[] b = name.toCharArray();
		System.out.println(Arrays.toString(b));

	}

}
