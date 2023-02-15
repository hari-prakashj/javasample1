package com.onesoft.java8;

public class UseCalculator {

	public static void main(String[] args) {
		Calculator add = (a,b)-> a+b;
		System.out.println(add.math(100, 50));
		Calculator sub = (a,b)-> a-b;
		System.out.println(sub.math(100, 50));
		Calculator divide = (a,b)-> a/b;
		System.out.println(divide.math(10, 2));
		Calculator mul = (a,b)-> a*b;
		System.out.println(mul.math(10, 2));
		Calculator modulus = (a,b)-> a%b;
		System.out.println(modulus.math(10, 2));
		//for reference
		add.define();
		Calculator.operation();

	}

}
