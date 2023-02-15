package com.onesoft.day8;

public class UseStudentMarks {

	public static void main(String[] args) {
		StudentMarks mark = new StudentMarks();
		mark.findTotal(50, 60, 70, 80, 90);
		mark.displayMarks(50, 60, 70, 80, 90);
		mark.findAverage(50, 60, 70, 80, 90);

	}

}
class StudentMarks {
	void findTotal(int tam,int eng, int maths, int sci, int soc) {
		System.out.println(tam+eng+maths+sci+soc);
	}
	void displayMarks (int tam,int eng, int maths, int sci, int soc) {
		System.out.println("Tamil="+tam+", English="+eng+", Maths="+maths+", Science="+sci+", Social="+soc);
	}
	void findAverage (int tam,int eng, int maths, int sci, int soc) {
		System.out.println((tam+eng+maths+sci+soc)/5);
	}
}
