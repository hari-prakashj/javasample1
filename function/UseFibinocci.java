package com.onesoft.revision;

import java.util.Arrays;

public class UseFibinocci {

	public static void main(String[] args) {
		Fibinocci fib = new Fibinocci();
		System.out.println(Arrays.toString(fib.findFibinocci(6)));
	}

}
class Fibinocci {
	int[] findFibinocci(int a) {
		int num1=0;
		int num2=1;
		int[] b = new int[a];
		//System.out.println(num1);
		//System.out.println(num2);
		for(int i=0;i<a;i++) {
			int num3 = num1+num2;
			
			b[i]=num3;
			//System.out.println(num3);
			num1=num2;
			num2=num3;
		}
		return b;
	}
}
