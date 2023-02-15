package com.onesoft.I3Revision;

public class TypeCasting {

	public static void main(String[] args) {
		int a =10;
		long b=a;;
		float c =b;
		double d=c;

		System.out.println(a+" "+b+" "+c+" "+d);
		
		double e = 1788.999;
		float f=(float)e;
		long g=(long)f;
		int h= (int)g;
		System.out.println(e+" "+g+" "+f+" "+h);

	}

}
