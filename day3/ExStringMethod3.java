package com.onesoft.day3;

import java.util.Arrays;

public class ExStringMethod3 {

	public static void main(String[] args) {
		String aa ="HE IS AN ARTIST";
		String bb = "he is an artist";
		String name = "mathan,srithar,ragu,";
		
		// toUpperCase()
		String upperCase = bb.toUpperCase();
		System.out.println(upperCase);
		
		//toLowerCase
		String lowerCase = aa.toLowerCase();
		System.out.println(lowerCase);
		
		//conCat()
		String concat = bb.concat(" with good stuff");
		System.out.println(concat);
				
		//length()
		int length = bb.length();
		System.out.println(length);
		
		//equals()
		Boolean equals = bb.equals("he is an artist");
		System.out.println(equals);
		
		Boolean equal1 = bb.equals(aa);
		System.out.println(equal1);
		
		//equalsIgnoreCase()
		Boolean equalsIgnore = aa.equalsIgnoreCase(bb);
		System.out.println(equalsIgnore);
		
		//startsWith()
		Boolean startsWith = aa.startsWith("H");
		System.out.println(startsWith);
		
		Boolean startsWith1 = aa.startsWith("h");
		System.out.println(startsWith1);
		
		//endsWith()
		Boolean endsWith = bb.endsWith("artist");
		System.out.println(endsWith);
		
		Boolean endsWith1 = bb.endsWith("ARTIST");
		System.out.println(endsWith1);
		
		//contains(()
		Boolean contains = aa.contains("A");
		System.out.println(contains);
		
		Boolean contains1 = bb.contains("A");
		System.out.println(contains1);
		
		//indexOf()
		int indexOf = bb.indexOf("d");
		System.out.println(indexOf);
		
		//chartAt()
		char charAt = bb.charAt(7);
	    System.out.println(charAt);
	    
	    char charAt1 = bb.charAt(bb.length()-1);
		System.out.println(charAt1);
		
		//substring()
		String substring = bb.substring(5,9);
		System.out.println(substring);
		
		String substring1 = bb.substring(2);
		System.out.println(substring1);
		
		// split()
		String[] splits = name.split(",");
		System.out.println(Arrays.toString(splits));
		
		String one = splits[0];
		System.out.println(one);
		System.out.println(one.charAt(0));
		
		String two = splits[1];
		System.out.println(two);
		System.out.println(two.charAt(0));
		
		String three = splits[2];
		System.out.println(three);
		System.out.println(three.charAt(0));
		
		//toCharArray()
		char[] charArray = bb.toCharArray();
		System.out.println(charArray[0]);
		// doubt
		String substring5 = name.substring(5,9);
		System.out.println(substring5);
	}

}
