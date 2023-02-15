package com.onesoft.day4;

public class ElseIfAge {

	public static void main(String[] args) {
		int a =51;
		
		if(a>=0&&a<=12) {
			System.out.println("Child");
		}
		else if(a>=13&&a<=19) {
			System.out.println("Teenager");
		}
		else if(a>=20&&a<=50) {
			System.out.println("Adult");
		}
		else if(a>50) {
			System.out.println("Senior Citizen");
		}
		else {
			System.out.println("Invalid Input");
		}

	}

}
