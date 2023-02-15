package com.onesoft.day8;

public class UseCalculator {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.add(10,2));
		System.out.println(c.sub());
		c.multi(10,2);
		c.div();

	}

}
class Calculator {
int add(int a,int b) {
	return a+b;
}
int sub() {
	int a=10;
	int b=5;
	return a-b;
}
void multi(int a, int b) {
	System.out.println(a*b);
}
void div() {
	int a=10;
	int b = 2;
	System.out.println(a/b);
}
}

