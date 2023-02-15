package com.onesoft.day1;

public class TestDay1 {
	public static void main(String[]args) {
		int num1 = 10;
		int num2 = 20;
		float num3 = 10.1f;
		float num4 = 20.1f;
		double num5 = 2.11111d;
		double num6 = 1.11111d;
		long num7 = 9999999999l;
		long num8 = 9999999911l;
		int radius = 5;
		float pi = 3.14f;
		int stu1 = 10;
		int stu2 = 11;
		int stu3 = 12;
		int stu4 = 13;
		int stu5 = 14;
		int celsius = 10;
		float height = 6.2f;
		float weight = 85f;
		float product1 = 123.4f;
		float product2 = 27.78f;
		int fatherAge = 60;
		int sonAge = 20;
		char char1 = 'A';
		char char2 = 'B';
		char char3 = '@';
		char value = '"';
		String str = value + "Onesoft Technologies" + value;
		String str1 = "1. " + value + "is the good place to" + value;
		String str2 = "i.  " + value + "learn java" + value;
		String nameOfStudent = "hari";
		int initial = 22;
		String studentName = "prakash";
		long studentMobileNumber = 8181818181l;
		String studentName1 = "ramu";
		String studentName2 = "sommu";
		int rollNumber1 = 11111;
		int rollNumber2 = 22222;
		String personName = "ragu";
		int height1 = 160;
		float weight1 = 88f;
		int input = 16;
		
		Boolean valuess = (stu1==0);
		
		System.out.println("the result = "+valuess);
		
	
		
		
		//Question 1
		int total1 = num1+num2;
		int total2 = num2-num1;
		int total3 = num1*num2;
		int total4 = num2/num1;
		// Question 2
		float total5 = num3+num4;
		float total6 = num4-num3;
		float total7 = num3*num4;
		float total8 = num4/num3;
		// Question 3
		double total9 = num5+num6;
		double total10 = num5-num6;
		double total11 = num5*num6;
		double total12 = num5/num6;
		// Question 4
		long total13 = num8-num7;
		// Question 5
		float total14 = (pi*(radius*radius));
		// Question 6
		int total15 = ((num1+num2)/2);
		// Question 10
		int total16 = ((stu1+stu2+stu3+stu4+stu5)/5);
		// Question 14
		int total17 = ((num1*num2)+stu1);
		// Question 15
		float fahrenheit = ((celsius*(9/5)+32));
		// Question 17
		int ques17 = ((num1+num2)*(num1+num2));
		// Question 18
		float ques18 = ((num4-num3)*(num4-num3));
		// Question 7
		float ques7 = product1*product2;
		// Question 11
		int ques11 = fatherAge-sonAge;
		// Question 12
		float ques12 = product1-weight;
		// Question 20
		String ques20 = str + str1;
		//Question 22
		float ques22 = height+weight+num3;
		// Question 26
		float ques26 = (weight1/(height1*height1));
		//Question 27
		String ques27 = studentName1+studentName2+personName;
		
		
		
		 
		
		System.out.println("Ques 1 = " +total1);
		System.out.println("Ques 1 = " +total2);
		System.out.println("Ques 1 = " +total3);
		System.out.println("Ques 1 = " +total4);
		
		System.out.println("Ques 2 = " +total5); 
		System.out.println("Ques 2 = " +total6);
		System.out.println("Ques 2 = " +total7);
		System.out.println("Ques 2 = " +total8);
		
		System.out.println("Ques 3 = " +total9);
		System.out.println("Ques 3 = " +total10);
		System.out.println("Ques 3 = " +total11);
		System.out.println("Ques 3 = " +total12);
		
		System.out.println("Ques 4 = "+total13);
		
		System.out.println("Ques 5 = " +total14);
		
		System.out.println("Ques 6 = " +total15);
		
		System.out.println("Ques 7 = " +ques7);
		
	
		
		System.out.println("Ques 9 = "+(Math.cbrt(num1)));
		System.out.println("Ques 9 = "+(Math.cbrt(num2)));
		System.out.println("Ques 9 = "+(Math.cbrt(stu5)));
		
		System.out.println("Ques 10 = " +total16);
		
		System.out.println("Ques 11 = " +ques11);
		
		System.out.println("Ques 12 = " +ques12);
		
		System.out.println(" Ques 13 = "+(char1+" "+char2));
		
		System.out.println("Ques 14 = " +total17);
		
		System.out.println("Ques 15 "+fahrenheit);
		
		System.out.println("Ques 16 = person height "+height);
		System.out.println("Ques 16 = person weight "+weight);
		
		System.out.println("Ques 17 = "+ques17);
		
		System.out.println("Ques 18 = "+ques18);
		
		System.out.println(str);
		System.out.println("  "+str1);
		System.out.println("                "+str2);
		
		System.out.println("Ques 20 = "+ques20);
		
		System.out.println("Ques 21 = "+(char1+""+char2+""+char3));
		
		System.out.println("Ques 22 = "+ques22);
		
		 System.out.println("Ques 23 = "+nameOfStudent);
		 System.out.println("Ques 23 = "+initial);
		 
		 System.out.println("Ques 24 = "+("Student Name = "+studentName+" "+"Student Mobile Number = "+studentMobileNumber));
		 
		 System.out.println("Ques25 = "+(studentName1+" = "+rollNumber1));
		 System.out.println("Ques25 = "+(studentName2+" = "+rollNumber2));
		 
		 System.out.println("Ques26 = "+ques26);
		 
		 System.out.println("Ques 27 = "+ques27);
		 
		 System.out.println("Ques 28 = "+(Math.sqrt(input)));
		 
		 
	}

}
