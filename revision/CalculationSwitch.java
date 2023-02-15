package com.onesoft.revision;

public class CalculationSwitch {

	public static void main(String[] args) {
		int a = 100;
		int b = 50;
		char c = '@';
		
		switch(c) {
		case'+': System.out.println(a+b+" is Addition");
		break;
		case'-': System.out.println(a-b+" is Subraction");
		break;
		case'/': System.out.println(a/b+" is Division");
		break;
		case'*': System.out.println(a*b+" is Multiplication");
		break;
		case'%': System.out.println(a%b+" is Modulus");
		break;
		default: System.out.println(c+" is not Arithemetic Operator");
		}

	}

}
