package com.onesoft.day6;

public class Section {

	public static void main(String[] args) {
		String[] a= {"Saranya","Ragu","Jana","Thilaka","Mathan","Hari"};
		for(int i=0;i<a.length;i++) {
			if(a[i].charAt(0)>='A' && a[i].charAt(0)<='H') {
				System.out.println(a[i]+" Section A");
			}
			else if(a[i].charAt(0)>='I' && a[i].charAt(0)<='P') {
				System.out.println(a[i]+" Section B");
			}
			else if(a[i].charAt(0)>='Q' && a[i].charAt(0)<='Z') {
				System.out.println(a[i]+ " Section C");
			}
			
		}

	}

}
