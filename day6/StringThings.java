package com.onesoft.day6;

public class StringThings {

	public static void main(String[] args) {
		String[] a= {"chair","tabels","bottel","chargers","remote"};
		for(int i=0;i<a.length;i++) {
			if(a[i].endsWith("s")) {
				System.out.println(a[i]);
			}
		}

	}

}
