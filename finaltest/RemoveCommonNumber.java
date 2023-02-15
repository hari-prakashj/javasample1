package com.onesoft.finaltest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveCommonNumber {
	public static void main(String[]args) {
		
		int[] a = {1,2,3,4};
		int[] b = {6,2,3,5};
		int c = a.length+b.length;
		List <Integer> list = new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			list.add(a[i]);
		}
		for(int i=0;i<b.length;i++) {
			list.add(b[i]);
		}
		System.out.println(list);
		boolean temp = true;
		List<Integer> result = new ArrayList<>();
		for(int i =0; i<result.size();i++) {
			for(int j=0; j<result.size();j++) {
				//if(i==j) {
					//continue;
				//}
				//else {
					if(list.get(i)==list.get(j)) {
						temp=true;
						break;
					}
					else {
						temp=false;
					}
				//}
			}
			if(temp==false) {
				result.add(list.get(i));
			}
		}
		
		
		System.out.println(result);

			
		}
	}


