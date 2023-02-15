package com.onesoft.day8;

public class UseCollege {

	public static void main(String[] args) {
		College c1 = new College();
		c1.name = "SRM";
		c1.fees = 1000;
		c1.grade = 'A';
		c1.location = "Chennai";
		College c2 = new College();
		c2.name = "MAM";
		c2.fees = 1500;
		c2.grade = 'B';
		c2.location = "Trichy";
		College c3 = new College();
		c3.name = "PSG";
		c3.fees = 2000;
		c3.grade = 's';
		c3.location = "Coimbatore";
		
		College[] clgs = {c1,c2,c3};
		
		System.out.println(c1.findclg(clgs));
		System.out.println(c1.findGrade(clgs));

	}

}
class College {
	String name;
	int fees;
	char grade;
	String location;
	
	String findclg(College[]a) {
		int max = a[0].fees;
		String aa="";
		for(int i=0;i<a.length;i++) {
			if(max<=a[i].fees) {
				max=a[i].fees;
				aa=a[i].name;
			}
		}
		return aa;
	}
	char findGrade(College[]a) {
		int min = a[0].location.length();
		char aa = 's';
		for(int i=0;i<a.length;i++) {
			if(min>=a[i].location.length()) {
				min = a[i].location.length();
				aa=a[i].grade;
			}
		}
		return aa;
	}
}