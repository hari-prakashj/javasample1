package com.onesoft.i3;

import java.util.Arrays;

public class RegExTest {
	public static void main(String[]args) {
		String a = "a1b2c3d4e5f6g7h8i9j10k11l12m12n13o14p15q16r17s18t19u20v21x22y23z24";
		String[] b = a.split("[0-99]");
		System.out.println(Arrays.toString(b));
	}

}
