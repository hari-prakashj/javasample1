package com.onesoft.day5;

public class StringCount {

	public static void main(String[] args) {
		String a ="FranklinSRVEC_358@Gmail.Com";
		int lc=0;
		int uc=0;
		int num=0;
		int sym=0;
		
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)>='a'&&a.charAt(i)<='z') {
				lc=lc+1;
			}
			else if(a.charAt(i)>='A'&&a.charAt(i)<='Z') {
				uc=uc+1;
			}
			else if(a.charAt(i)>='0'&&a.charAt(i)<='9') {
				num=num+1;
			}
			else {
				sym=sym+1;
			}
		}
		System.out.println(lc);
		System.out.println(uc);
		System.out.println(num);
		System.out.println(sym);

	}

}
