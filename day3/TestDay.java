package com.onesoft.day3;

import java.util.Arrays;

public class TestDay {

	public static void main(String[] args) {
		// Question 7
		String aa = "Java,PYTHON,C++";
		
		// Split the string
		String [] value = aa.split(",");
		System.out.println(Arrays.toString(value));
		
		// length of each string
		String one = value[0];
		System.out.println(one.length());
		
		String two = value[1];
		System.out.println(two.length());
		
		String three = value[2];
		System.out.println(three.length());
		
        // convert it to lower case
		String lower = one.toLowerCase();
		System.out.println(lower);
		
		String lower1 = two.toLowerCase();
		System.out.println(lower1);
		
		String lower2 = three.toLowerCase();
		System.out.println(lower2);
		
		//Question 14
		String bb = "world wide wonder";
		
		//split the string
		String[] bbs = bb.split(" ");
		System.out.println(Arrays.toString(bbs));
		
		String bbOne = bbs[0];
		String bbtwo = bbs[1];
		String bbthree = bbs[2];
		
		// length of each string 
		int length = bbOne.length();
		System.out.println(length);
		
		int length1 = bbtwo.length();
		System.out.println(length1);
		
		int length2 = bbthree.length();
		System.out.println(length2);
		
		//convert each string to uppercase()
		String upper = bbOne.toUpperCase();
		System.out.println(upper);
		
		String upper1 = bbtwo.toUpperCase();
		System.out.println(upper1);
		
		String upper2 = bbthree.toUpperCase();
		System.out.println(upper2);
		
		// add the string "programs" to the given string
		String concat = bb.concat(" programs");
		System.out.println(concat);

}
}
