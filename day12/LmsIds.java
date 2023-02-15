package com.onesoft.day12;

import java.util.ArrayList;

public class LmsIds {

	public static void main(String[] args) {
		ArrayList<Integer> lms = new ArrayList<>();
		lms.add(570);
		lms.add(839);
		lms.add(1021);
		lms.add(1019);
		lms.add(1022);
		
//		for(int i=0; i<lms.size();i++) {
//			System.out.println(lms.get(i));
//		}
		
//		for(Integer id:lms) {
//			System.out.println(id);
//		}
		
		//lms.forEach(x->System.out.println(x));
		
//		for(int i=lms.size()-1;i>=0;i--) {
//			System.out.println(lms.get(i));
//		}
		
//        for(Integer id:lms) {
//        	if(id%2==0) {
//        		System.out.println(id+" is even number");
//        	}
//        	else {
//        		System.out.println(id+" is odd number");
//        	}
//        }
//		int mini = lms.get(0);
//		for(Integer id:lms) {
//			if(mini>=id) {
//				System.out.println(id+" is minimun number");
//			}
//		}
		
		lms.forEach(x->{
			if(x>=1000) {
				System.out.println(x);
			}
		
	});
	}
}
