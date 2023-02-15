package com.onesoft.i5;

public class DesiredOutputOfString {

	public static void main(String[] args) {
		String a = "a1b2c3";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < a.length(); i++) {
		    char c = a.charAt(i);
		    if (Character.isLetter(c)) {
		        int count = Character.getNumericValue(a.charAt(i+1));
		        for (int j = 0; j < count; j++) {
		            sb.append(c);
		        }
		    }
		}
		String output = sb.toString();
		System.out.println(output);

	}

}
