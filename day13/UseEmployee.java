package com.onesoft.day13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class UseEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee("hari",1,true,20000);
		Employee e2 = new Employee("prakash",2,false,15000);
		Employee e3 = new Employee("jana",3,true,70000);
		Employee e4 = new Employee("thilaka",4,true,50000);
		
		HashMap<Integer,Employee> emp = new HashMap<>();
		emp.put(e1.getId(), e1);
		emp.put(e2.getId(), e2);
		emp.put(e3.getId(), e3);
		emp.put(e4.getId(), e4);
		
//		for(Integer x:emp.keySet()) {
//			System.out.println(emp.get(x));
//		}
		//emp.keySet().forEach(x->System.out.println(emp.get(x)));
       HashMap<Integer,Employee> pemp = new HashMap<>();
       
       HashMap<Integer,Employee> nonpemp = new HashMap<>();
       
       emp.keySet().forEach(x->{
    	   if(emp.get(x).isPermanent()) {
    		   pemp.put(emp.get(x).getId(), emp.get(x));
    	   }
    	   else {
    		   nonpemp.put(emp.get(x).getId(), emp.get(x));
    	   }
    	   });
      // pemp.keySet().forEach(y->System.out.println(pemp.get(y)));
       
       //nonpemp.keySet().forEach(z->System.out.println(nonpemp.get(z)));
       
//       emp.forEach((x,y)->{
//    	   if(y.isPermanent()==true) {
//    		   emp.remove(x);
//    	   }
//       });
//       System.out.println(emp);
       
//       Iterator<Employee>itr=emp.values().iterator();
//       while(itr.hasNext()) {
//       System.out.println(itr.next());
//       }
      
       
       
       Iterator<Employee>itr1=emp.values().iterator();
       while(itr1.hasNext()) {
    	  // Employee temp=itr1.next();
    	   if(itr1.next().isPermanent()==true) {
    		   System.out.println(itr1);
    		   itr1.remove();
       }
       }
	System.out.println(emp);
       
		//       Iterator<Employee>itr2=emp.values().iterator();
		//       while(itr2.hasNext()) {
		//    	   Employee temp1=itr2.next();
		//    	   if(temp1.getName().contains("i")) {
		//    		   itr2.remove();
		//    	   }
		//       }
		//       System.out.println(emp);

}
}
