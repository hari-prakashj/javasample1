package com.onesoft.lmsintro;

public class PersonDetails {

	public static void main(String[] args) {
		String[] a = args[0].split(",");
		
		String name = a[0];
		int id = Integer.parseInt(a[1]);
		long mobileNumber = Long.parseLong(a[2]);
		boolean isFemale = Boolean.parseBoolean(a[3]);
		
		System.out.println("Name:"+name+" Id:"+id+" MobileNum:"+mobileNumber+" IsFemale:"+isFemale);
		

	}

}
