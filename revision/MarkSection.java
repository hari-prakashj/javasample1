package com.onesoft.revision;

public class MarkSection {

	public static void main(String[] args) {
		int mark = 101;
		
		if(mark>=91&&mark<=100) {
			System.out.println(mark+" is S grade");
		}
		else if(mark>=81&&mark<=90) {
			System.out.println(mark+" is A grade");
		}
		else if(mark>=71&&mark<=80) {
			System.out.println(mark+" is B grade");
		}
		else if(mark>=51&&mark<=70) {
			System.out.println(mark+" is C grade");
		}
		else if(mark>=35&&mark<=50) {
			System.out.println(mark+" is D grade");
		}
		else if(mark>=0&&mark<=35) {
			System.out.println(mark+" is a fail");
		}
		else {
			System.out.println("Invalid Input");
		}

	}

}
