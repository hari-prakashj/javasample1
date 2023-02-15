package com.onesoft.day2;

public class Employee {
	public static void main(String[]args) {
		EmpDetails e1 = new EmpDetails();
		e1.name = "Hari";
		e1.enpNo = 111;
		e1.age = 25;
		e1.mobileNumber = 8888888888l;
		e1.salary = 10000f;
		e1.tax = 5f;
		float taxable1 = (e1.salary*(e1.tax/100));//  10000*5/100
		//System.out.println(taxable1);
		e1.netSalary = (e1.salary-taxable1);
		//System.out.println(e1.netSalary);
		
		EmpDetails e2 = new EmpDetails();
		e2.name = "Prakash";
		e2.enpNo = 112;
		e2.age = 26;
		e2.mobileNumber = 9999999999l;
		e2.salary = 15000f;
		e2.tax = 5f;
		float taxable2 = (e2.salary*(e2.tax/100));
		//System.out.println(taxable2);
		e2.netSalary = (e2.salary-taxable2);
		//System.out.println(e2.netSalary);
		
		EmpDetails e3 = new EmpDetails();
		e3.name = "Rammu";
		e3.enpNo = 113;
		e3.age = 27;
		e3.mobileNumber = 7777777777l;
		e3.salary = 20000f;
		e3.tax = 5f;
		float taxable3 = (e3.salary*(e3.tax/100));
		//System.out.println(taxable3);
		e3.netSalary = (e3.salary-taxable3);
		//System.out.println(e3.netSalary);
		
		EmpDetails e4 = new EmpDetails();
		e4.name = "Sommu";
		e4.enpNo = 114;
		e4.age= 28;
		e4.mobileNumber = 6666666666l;
		e4.salary = 25000f;
		e4.tax = 5f;
		float taxable4 = (e4.salary*(e4.tax/100));
		//System.out.println(taxable4);
		e4.netSalary = (e4.salary-taxable4);
		//System.out.println(e4.netSalary);
		
		EmpDetails e5 = new EmpDetails();
		e5.name = "Raja";
		e5.enpNo = 115;
		e5.age = 29;
		e5.mobileNumber = 9898989898l;
		e5.salary = 30000f;
		e5.tax = 5f;
		float taxable5 = (e5.salary*(e5.tax/100));
		//System.out.println(taxable5);
		e5.netSalary = (e5.salary-taxable5);
		//System.out.println(e5.netSalary);
		
		//float averageNetSalary = ((e1.netSalary+e2.netSalary+e3.netSalary+e4.netSalary+e5.netSalary)/5);
		
		//System.out.println("Average NetSalary = "+averageNetSalary);
		System.out.println(e1.name+"\n"+e1.enpNo+"\n"+e1.age+"\n"+e1.mobileNumber+"\n"+e1.salary+"\n"+e1.tax+"\n"+e1.netSalary);
//		System.out.println(e2.name+"\n"+e2.enpNo+"\n"+e2.age+"\n"+e2.mobileNumber+"\n"+e2.salary+"\n"+e2.tax+"\n"+e2.netSalary);
//		System.out.println(e3.name+"\n"+e3.enpNo+"\n"+e3.age+"\n"+e3.mobileNumber+"\n"+e3.salary+"\n"+e3.tax+"\n"+e3.netSalary);
//		System.out.println(e4.name+"\n"+e4.enpNo+"\n"+e4.age+"\n"+e4.mobileNumber+"\n"+e4.salary+"\n"+e4.tax+"\n"+e4.netSalary);
//		System.out.println(e5.name+"\n"+e5.enpNo+"\n"+e5.age+"\n"+e5.mobileNumber+"\n"+e5.salary+"\n"+e5.tax+"\n"+e5.netSalary);
	}

}
class EmpDetails{
	String name;
	int enpNo;
	int age;
	long mobileNumber;
	float salary;
	float tax;
	float netSalary;
}
