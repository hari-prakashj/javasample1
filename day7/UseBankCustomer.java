package com.onesoft.day7;

public class UseBankCustomer {

	public static void main(String[] args) {
		BankCustomer customer1 = new BankCustomer();
		customer1.name = "hari";
		customer1.age = 28;
		customer1.accountNumber = 2121212121l;
		customer1.isSavingsAccount = true;
		BankCustomer customer2 = new BankCustomer();
		customer2.name = "jana";
		customer2.age = 61;
		customer2.accountNumber = 3131313131l;
		customer2.isSavingsAccount = false;
		BankCustomer customer3 = new BankCustomer();
		customer3.name = "prakash";
		customer3.age = 35;
		customer3.accountNumber = 4141414141l;
		customer3.isSavingsAccount = true;
		
		BankCustomer[] customers = new BankCustomer[3];
		customers[0]=customer1;
		customers[1]=customer2;
		customers[2]=customer3;
		
		
//		int max = customer1.age;
//		for(int i=0;i<customers.length;i++) {
//			if(max<=customers[i].age) {
//				max = customers[i].age;
//			}
//		}
//		System.out.println(max);
		
//		BankCustomer maxi = customers[0];
//		for(int j=0;j<customers.length;j++) {
//			if(maxi.age<=customers[j].age) {
//				maxi=customers[j];
//			}
//		}
//		System.out.println(maxi.name+","+maxi.age+","+maxi.accountNumber+","+maxi.isSavingsAccount);
//		int maxAge=customer1.age; String maxName=customer1.name; boolean maxSavings=false; long max=0;
//		for(int i=0;i<customers.length;i++) {
//			if(customers[i].age>=maxAge) {
//				maxAge=customers[i].age;
//				maxName=customers[i].name;
//				max=customers[i].accountNumber;
//				maxSavings=customers[i].isSavingsAccount;
//			}
//		}
//		System.out.println(maxAge+maxName+max+maxSavings);
		BankCustomer mini = customers[0];
		for(int i=0;i<customers.length;i++) {
			if(mini.age>=customers[i].age) {
				mini=customers[i];
			}
		}
		System.out.println(mini.name+","+mini.age+","+mini.accountNumber+","+mini.isSavingsAccount);

	}

}
class BankCustomer {
	String name;
	int age;
	long accountNumber;
	boolean isSavingsAccount;
	String ifsc;
	int balance;
}