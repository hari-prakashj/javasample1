package com.onesoft.day6;

public class StringArray {

	public static void main(String[] args) {
		String[] name= {"franklin","revathi","mani","hari","prakash"};
		
		for(int i=0;i<name.length;i++) {
			System.out.println("First Letter "+name[i].charAt(0)+"\nLast Letter "+name[i].charAt(name[i].length()-1));
		}
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i].charAt(i));
		}
		

	}

}
