package com.onesoft.java8;

import java.util.Optional;

public class Practise {

	public static void main(String[] args) {
		String word=null;
		Optional <String> check = Optional.ofNullable(word); 
		if(check.isPresent()==true) {
			System.out.println(word.toUpperCase());
		}
		else {
			System.out.println("The Value is null");
		}
		System.out.println(check.orElse("null"));

	}

}
