package com.onesoft.i4;

import java.util.StringJoiner;

public class StringJoinerrrr {

	public static void main(String[] args) {
		StringJoiner s =new StringJoiner(":","[","]");
		s.add("hari");
		s.add("prakash");
		System.out.println(s);
		
		StringJoiner d =new StringJoiner(" ");
		d.add("jana");
		d.add("p");
		System.out.println(d);
		
		StringJoiner c = s.merge(d);
		System.out.println(c+" "+c.length());

	}

}
