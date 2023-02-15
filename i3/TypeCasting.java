package com.onesoft.i3;

public class TypeCasting {

	public static void main(String[] args) {
		int a =10;
		long b=a;;
		float c =b;
		double d=c;

		System.out.println(a+" "+b+" "+c+" "+d);


		double e = 1788.999;
		float g=(float)e;
		long f=(long)g;
		int h= (int)f;
		System.out.println(e+" "+g+" "+f+" "+h);
	}

}
