package com.onesoft.day12;

import java.util.ArrayList;

public class UseEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee("hari",1,28,true,"male",10000);
		Employee e2 = new Employee("prakash",2,29,true,"male",15000);
		Employee e3 = new Employee("jana",3,42,true,"male",30000);
		Employee e4 = new Employee("thilaka",4,38,false,"female",25000);
		
		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		
		for(Employee a:emp) {
			if() {}
		}

	}

}
