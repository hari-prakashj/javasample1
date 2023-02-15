package com.onesoft.day8;

public class UseFindMximum {

	public static void main(String[] args) {
		FindMaximum max = new FindMaximum();
		System.out.println(max.findmax(5, 7, 11));

	}

}
class FindMaximum {
	int findmax(int a,int b, int c) {
		
		if(a>b && a>c) {
			return a;
		}
		else if(b>a && b>c) {
			return b;
		}
		
		else  {
			return c;
		}
		
	}
}
