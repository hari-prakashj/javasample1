package com.onesoft.day13;

import java.util.HashMap;

public class Pen {

	public static void main(String[] args) {
		String pen1 = "Natraj";
		String pen2 = "cello";
		String pen3 = "Flair";
		String pen4 = "Reynolds";
		String pen5 = "Parker";
		
		HashMap<Integer,String>pens = new HashMap<>();
		pens.put(1, pen1);
		pens.put(2, pen2);
		pens.put(3, pen3);
		pens.put(4, pen4);
		pens.put(5, pen5);
		
		
//		for(Integer s:pens.keySet()) {
//			System.out.println(s+" "+pens.get(s));
//		}
		
//		for(String s:pens.values()) {
//			System.out.println(s);
//		}
		
		//pens.forEach((x,y)->System.out.println(x+" "+y));
		
		//pens.keySet().forEach(x->System.out.println(x));
		
		pens.values().forEach(x->System.out.println(x));
	}

}
