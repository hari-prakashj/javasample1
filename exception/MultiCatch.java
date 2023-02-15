package com.onesoft.exception;

public class MultiCatch {

	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};
		try {
			System.out.println(num[7]+num[8]);
		}
		catch (ArithmeticException ae) {
			System.out.println("aaaa");
		}
		catch (NullPointerException ne) {
			System.out.println("bbbbbb");
		}
		catch (NumberFormatException nfe) {
			System.out.println("cccccc");
		}
		catch (IndexOutOfBoundsException ie) {
			System.out.println("ddddddd");
		}
		catch (Exception e) {
			System.out.println("eeeeeee");
		}
	}

}
