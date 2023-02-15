package com.onesoft.i3;

public class FinalizeeKeyword {

	public static void main(String[] args) {
		String a = "hari";
		a=null;
		System.gc();
		System.out.println("Delted");
	}

}
