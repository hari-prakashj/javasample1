package com.onesoft.i5;

import java.util.Arrays;

public class RearrangeString {

	public static void main(String[] args) {
		String a = "abcfhedg";
		char[] b = a.toCharArray();
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
	}

}
