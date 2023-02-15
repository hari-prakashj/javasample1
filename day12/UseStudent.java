package com.onesoft.day12;

import java.util.ArrayList;

public class UseStudent {

	public static void main(String[] args) {
		Student s1 = new Student("hari",1001,"a",true);
		Student s2 = new Student("prakash",1002,"b",false);
		Student s3 = new Student("jana",1003,"c",true);
		Student s4 = new Student("ram",1004,"b",true);
		
		ArrayList<Student> stud = new ArrayList<>();
		stud.add(s1);
		stud.add(s2);
		stud.add(s3);
		stud.add(s4);
		
//		for(int i=0;i<stud.size();i++) {
//			System.out.println(stud.get(i));
//		}
		
//		for(Student a:stud) {
//			System.out.println(a);
//		}
		
		//stud.forEach(b->System.out.println(b));
		
//		stud.forEach(c->{
//			if(c.getIsPresent()) {
//				System.out.println(c);
//			}
//		});
		
//		for(Student d:stud) {
//			if(d.gerGrade().contains("b")) {
//				System.out.println(d);
//			}
//		}
		
//		for(int i=0;i<stud.size();i++) {
//			if(stud.get(i).getName().length()>6 && stud.get(i).getRollNumber()>1001) {
//				System.out.println(stud.get(i));
//			}
//		
//		}
//        int mini = stud.get(0).getRollNumber();
//        String aa = stud.get(0).getName();
//		for(Student e:stud) {
//			if(mini>=e.getRollNumber()) {
//				mini = e.getRollNumber();
//				aa=e.getName();
//			}
//		}
//		System.out.println(aa);
		
//		Student mini = stud.get(0);
//		for(Student e:stud) {
//			if(mini.getRollNumber()>=e.getRollNumber()) {
//				mini=e;
//			}
//		}
//		System.out.println(mini.getName());
		
		ArrayList<Student>presentedStud = new ArrayList<>();
		for(Student x:stud) {
			if(x.getIsPresent()) {
				presentedStud.add(x);
			}
		}
		presentedStud.forEach(y->System.out.println(y		));
	}

}
