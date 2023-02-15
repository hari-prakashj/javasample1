package com.onesoft.revision;

public class Letters {

	public static void main(String[] args) {
		String a = "apples";
		

		if(a.endsWith("a")||a.endsWith("e")||a.endsWith("i")||a.endsWith("o")||a.endsWith("u")) {
			System.out.println(a+" ends with vowel");
		}
		else if(a.endsWith("s")) {
			System.out.println(a+" the word is plural");
		}
		else {
			System.out.println("It ends with consonant");
		}
	}

}
