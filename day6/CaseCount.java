package com.onesoft.day6;

public class CaseCount {

	public static void main(String[] args) {
		String mail="HariPraKash.Jana@gMail.Com";
		char[] a=mail.toCharArray();
		int upper=0;
		int lower=0;
		int symbol=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>='A' && a[i]<='Z') {
				upper++;
			}
			else if(a[i]>='a' && a[i]<='z') {
				lower++;
			}
			else {
				symbol++;
			}
		}
		System.out.println("UpperCount = "+upper+" LowerCount = "+lower+" Symbol = "+symbol);
	}

}
