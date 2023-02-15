package com.onesoft.exception;

public class UseVoterEligibility {

	public static void main(String[] args) throws VoterEligibility,Exception{
		int age = 17;
		try {
		
		if(age>=18) {
			System.out.println("Eligible to vote");
		}
		else {
			throw new VoterEligibility("invalid data");
		}
		}
		catch (VoterEligibility ve) {
			System.out.println("not eligible");
		}

	}

}
