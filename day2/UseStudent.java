package com.onesoft.day2;

public class UseStudent {
	public static void main(String[]args) {
		Student s1 = new Student();
		s1.name = "hari";
		s1.id = 1001;
		s1.dept = "mech";
		s1.isMale = true;
		s1.fatherName = "jana";
		
		Student s2 = new Student();
		s2.name = "sri";
		s2.id = 2002;
		s2.dept = "eee";
		s2.isMale= true;
		s2.fatherName = "perumal";
		
		Student s3 = new Student();
		s3.name = "saran";
		s3.id = 3003;
		s3.dept = "mca";
		s3.isMale= false;
		s3.fatherName = "perumal";
		
		
		System.out.println(s1.name+", "+s1.id+", "+s1.dept+", "+s1.isMale+", "+s1.fatherName);
		System.out.println("Name="+s2.name+", Id="+s2.id+", Department="+s2.dept+", IsMale="+s2.isMale+", FatherName="+s2.fatherName);
		System.out.println("One="+s3.name+ ", Two="+s3.id+", Three="+s3.dept+", Four="+s3.isMale+", Five="+s3.fatherName);
	}
	

}
