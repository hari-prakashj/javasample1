package com.onesoft.day6;

public class Palindrome {

	public static void main(String[] args) {
		String [] a= {"madam","table","mom","dad","malayalam","level","chair"};
		
		for(int i=0;i<a.length;i++) {
			String reverse="";
			for(int j=a[i].length()-1;j>=0;j--) {
				reverse=reverse+a[i].charAt(j);
			}
			if(reverse.equalsIgnoreCase(a[i])) {
				System.out.println(a[i]+" is palindrome");
			}
			else {
				System.out.println(a[i]+" is not palindrome");
			}
		}

	}

}
