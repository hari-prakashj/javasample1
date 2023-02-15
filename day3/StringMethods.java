package com.onesoft.day3;

import java.util.Arrays;

public class StringMethods {
	public static void main(String[]args) {
		String aa = "I LOVE CODING";
		String bb = "i am a traveller";
		String cc = "i am a traveller";
		String dd = "i love coding";
		
		//array
		int[] marks = {75,80,92,69,75};
        System.out.println(marks[3]);
        System.out.println(marks[marks.length-1]);
        
        String[] names = {"hari","prakash","jana","thilaka"};
        String ab = names[names.length-1];
        System.out.println(ab);
        System.out.println(ab.charAt(ab.length()-1));
		
		// toUpperCase()
		String upperCase = bb.toUpperCase();
		System.out.println(upperCase);
		
		// toLowerCase()
		String lowerCase = aa.toLowerCase();
		System.out.println(lowerCase);
		
		//conCat()
		String concat = bb.concat("in bike");
		System.out.println(concat);
		
		//length()
		int length = bb.length();
		System.out.println(length);
		
		//equals()
		System.out.println(bb.equals(cc));
		System.out.println(bb.equals(aa));
		System.out.println(bb.equals("i am a traveller"));
		
		//equalsIgnoreCase()
		System.out.println(aa.equalsIgnoreCase(dd ));
		System.out.println(bb.equalsIgnoreCase(aa));
		
		//startsWith()
		System.out.println(aa.startsWith("I"));
		System.out.println(aa.startsWith("i"));
		
		//endsWith()
		System.out.println(bb.endsWith("traveller"));
		System.out.println(bb.endsWith("Traveller"));
		
		//contains(()
		System.out.println(dd.contains("g"));
		System.out.println(dd.contains("r"));
		
		//indexOf()
		// virtual count
		System.out.println(bb.indexOf("traveller"));
		
		//chartAt()
		System.out.println(bb.charAt(7));
		System.out.println(bb.charAt(bb.length()-1));
		
		//substring()
		System.out.println(bb.substring(5,9));
		System.out.println(bb.substring(2));
		
		// split()
		String[] splits = bb.split("a");
		System.out.println(Arrays.toString(splits));
		System.out.println(splits[1]);
		
		//toCharArray()
		char[] charArray = bb.toCharArray();
		System.out.println(Arrays.toString(charArray));
		System.out.println(charArray[0]);
		
		
		
		
		
	}

}
