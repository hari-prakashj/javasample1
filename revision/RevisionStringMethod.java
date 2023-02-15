package com.onesoft.revision;

import java.util.Arrays;

public class RevisionStringMethod {

	public static void main(String[] args) {
		String a ="HariPrakash";
		String b = "Janardhanam";
		String[] c = {"hari,prakash,jana,thilaka"};
		String[] d = {"thilaka jana prakash jana"};
		String[] e = {"prakash1jana2hari3thilaka"};
		
		//Uppercase
		String value1 = a.toUpperCase();
		System.out.println(value1);
		//LowerCase
		String value2 = a.toLowerCase();
		System.out.println(value2);
		//concat
		String value3 = a.concat(b);
		System.out.println(value3);
		//length
		int value4 = a.length();
		System.out.println(value4);
		//equals
		boolean value5 = a.equals(b);
		System.out.println(value5);
		//equalsignorecase
		boolean value6 = a.equalsIgnoreCase(b);
		System.out.println(value6);
		//Startswith
		boolean value7 = a.startsWith("H");
		System.out.println(value7);
		//endswith
		boolean value8 = a.endsWith("a");
		System.out.println(value8);
		//contains
		boolean value9 = a.contains("h");
		System.out.println(value9);
		//indexof
		int value10 = a.indexOf("a");
		System.out.println(value10);
		//charAt
		char value111 = a.charAt(0);
		System.out.println(value111);
		char value11 = a.charAt(a.length()-1);
		System.out.println(value11);
		//subString
		String value12 = a.substring(5,9);
		System.out.println(value12);
		//tochar
		char[] value13 = a.toCharArray();
		System.out.println(Arrays.toString(value13));
		System.out.println(value13[0]);
		//Split
		String[] value14 = c[0].split(",");
		System.out.println(Arrays.toString(value14));
		System.out.println(value14[0]);
		//Split regex
		String[] value15 = d[0].split("\\s");
		System.out.println(Arrays.toString(value15));
		String[] value16 = e[0].split("[0-9]");
		System .out.println(Arrays.toString(value16));

	}

}
