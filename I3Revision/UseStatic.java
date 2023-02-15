package com.onesoft.I3Revision;

public class UseStatic {
static {System.out.println("Demo");}
	public static void main(String[] args) {
		Static s1 = new Static();
		s1.display("hari",28);
		
		System.out.println(Static.sample("prakash"));
	}

}
class Static {
	int age;
	String name;
	static String location = "Chennai";
//	public Static(int age, String name) {
//		super();
//		this.age = age;
//		this.name = name;
//	}
	public void display(String name, int age) {
		System.out.println(name+age+location);
	}
	public static String sample (String a) {
		return a;
	}
	
}
