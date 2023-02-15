package com.onesoft.i4Revision;

import java.util.StringJoiner;

public class StringgJoinerr {

	public static void main(String[] args) {
		StringJoiner a = new StringJoiner(":");
		a.add("hari");
		a.add("prakash");
		System.out.println(a);
		
		StringJoiner b = new StringJoiner(" ");
		b.add("one");
		b.add("softs");
		System.out.println(b);
		
		StringJoiner c = a.merge(b);
		System.out.println(c+" "+c.length());

	}

}
