package com.onesoft.i4;

public class PassByValueAndReference {

	public static void main(String[] args) {
		Sample s1 = new Sample();
		System.out.println(s1.a);
		System.out.println(s1.add("prakash"));
		System.out.println(s1.add(s1.a));
		System.out.println(s1.a);
		
	

	}

}
class Sample {
	String a="hari";
public String add(String b) {
	return a=a+b;
}
}
