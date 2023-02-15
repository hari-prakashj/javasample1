package com.onesoft.exception;

public class UseLoginException {

	public static void main(String[] args) throws LogInException,Exception {
		String username = "hari2494";
		String password = "9922992";
		
		if(username.length()>8 && password.length()>8) {
			System.out.println("Success");
		}
		else {
			throw new LogInException("Invalid data");
		}

	}

}
