package com.onesoft.day8;

public class UseAtm {

	public static void main(String[] args) {
		Atm atm1 = new Atm();
		atm1.bankName = "CUB";
		atm1.location = "Perungudi";
		atm1.mainBal = 2000;
		atm1.depositAmt = 1000;
		
		System.out.println(atm1.bankName+""+atm1.location);
		System.out.println(atm1.findCredit(atm1.mainBal, atm1.depositAmt));
		System.out.println(atm1.findDebit(atm1.mainBal, atm1.depositAmt));

	}

}
class Atm {
	String bankName;
	String location;
	int mainBal;
	int depositAmt;
	String findCredit(int a,int b) {
		return "Credit Amt is"+ (a+b);
	}
	String findDebit(int a, int b) {
		return "Debit Amt is"+(a-b);
	}
}
