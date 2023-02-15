package com.onesoft.day2;

public class AdditionMethod {

	public static void main(String[] args) {
		
		Calculator c = new Calculator();// instantiation
		
		System.out.println(c.addition());
		// int num = c.addition(); can be assigned
		
		System.out.println(c.paraaddition(5, 50));
		
		c.voidaddition(50, 50);
	}

}
class Calculator{
	public int addition() {
		int num1 = 10;
		int num2 = 20;
		int total = num1+num2;
		return total;
	}
	
	public int paraaddition(int num1, int num2) {
		return num1+num2;
	}
	
	public void voidaddition(int num1, int num2) {
		int total = num1+num2;
		System.out.println(total);
	}
}

