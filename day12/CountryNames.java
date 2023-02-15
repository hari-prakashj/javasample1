package com.onesoft.day12;

import java.util.ArrayList;

public class CountryNames {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<>();
		name.add("india");
		name.add("germany");
		name.add("australia");
		name.add("iran");
		name.add("canada");
		
//		for(int i=0;i<name.size();i++) {
//			if(name.get(i).startsWith("i")) {
//				System.out.println(name.get(i));
//			}
//		}
//        for(String a:name) {
//        	if(a.contains("a")||a.contains("e")||a.contains("i")||a.contains("o")||a.contains("u")) {
//        		System.out.println(a);
//        	}
//        }
		
//		for(int i=0;i<name.size();i++) {
//			if(name.get(i).length()>5) {
//				System.out.println(name.get(i));
//			}
//		}
		
		int max = name.get(0).length();
		String c = name.get(0);
		for(int i=0;i<name.size();i++) {
			if(max<=name.get(i).length()) {
				max=name.get(i).length();
				c=name.get(i);
				}
			}
		System.out.println(c);
		}
				

}
