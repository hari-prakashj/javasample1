package com.onesoft.revision;

public class Stanley {

	public static void main(String[] args) {
		String a = "@STanLeY";
		
		if(a.charAt(0)>='A'&&a.charAt(0)<='Z') {
			String value = a.toUpperCase();
			System.out.println(value);
		}
		else if(a.charAt(0)>='a'&&a.charAt(0)<='z') {
			String value1 = a.toLowerCase();
			System.out.println(value1);
		}
		else if(a.charAt(0)>='0'&&a.charAt(0)<='9') {
			char value2 = a.charAt(0);
			System.out.println(value2);
		}
		else {
			System.out.println("It is a Symbol");
		}

	}

}
