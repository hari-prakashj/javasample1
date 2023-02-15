package com.onesoft.day8;

public class UseOddEven {

	public static void main(String[] args) {
		OddEven value = new OddEven();
		System.out.println(value.findOddOrEven());

	}

}
class OddEven {
	String findOddOrEven() {
		int a=11;
		 if(a%2==0) {
			 return "Even";
		 }
		 else {
			 return "Odd";
		 }
	}
}