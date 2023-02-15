package com.onesoft.day8;

public class UseStringArray {

	public static void main(String[] args) {
		StringArray  ab = new StringArray();
		String[] value = {"hari","prakash","jana","thilaka"};
		System.out.println(ab.findmax(value));
		ab.findmini(value);

	}

}
class StringArray {
	String findmax(String[] a) {
		int max = a[0].length();
		String temp = "";
		for(int i=0;i<a.length;i++) {
			if(max<=a[i].length()) {
				max=a[i].length();
				temp = a[i];
			}
		}
		return temp;
	}
	void findmini(String[]a) {
		int min = a[0].length();
		String temp1="";
		for(int i=0;i<a.length;i++) {
			if(min>=a[i].length()) {
				min=a[i].length();
				temp1 = a[i];
			}
		}
		System.out.println(temp1);
	}
}