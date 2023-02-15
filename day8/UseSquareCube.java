package com.onesoft.day8;

public class UseSquareCube {

	public static void main(String[] args) {
		SquareCube ans = new SquareCube();
		System.out.println(ans.findSquare(5));
		System.out.println(ans.findCube(3));

	}

}
class SquareCube {
	int findSquare(int a) {
		return a*a;
	}
	int findCube(int a) {
		return a*a*a;
	}
}
