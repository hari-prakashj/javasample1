package com.onesoft.day6;

public class SringArray1 {

	public static void main(String[] args) {
		String[] a = {"Hari","prakash","Ragu","Saran","mathan"};
		for(int i=0;i<a.length;i++) {
			if(a[i].charAt(0)>='A' && a[i].charAt(0)<='Z') {
				System.out.println(a[i]);
			}
		}

	}

}
