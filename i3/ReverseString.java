package com.onesoft.i3;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abcdefghijklmnopqrstuvxyz";
		String b ="";
		for(int i=a.length()-1;i>=0;i--) {
			b=b+a.charAt(i);
		}
		System.out.println(b);

	}

}
