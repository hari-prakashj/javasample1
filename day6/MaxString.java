package com.onesoft.day6;

public class MaxString {

	public static void main(String[] args) {
		String[] name= {"hari","ragu","saranya","prakash","mathan"};
		String max=name[0];
		for(int i=0;i<name.length;i++) {
			if(max.length()<name[i].length()) {
				max=name[i];
			}
		}
		System.out.println(max);

	}

}
