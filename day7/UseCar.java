package com.onesoft.day7;

public class UseCar {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.brand = "Ford";
		car1.model = "eccosport";
		car1.cc = 1500;
		car1.price = 100000;
		Car car2 = new Car();
		car2.brand = "toyato";
		car2.model = "innova";
		car2.cc = 2400;
		car2.price = 1000000;
		
		Car car3 = new Car();
		car3.brand = "tata";
		car3.model = "safari";
		car3.cc = 2200;
		car3.price = 1500000;
		
		Car[] cars = new Car[3];
		cars[0]=car1;
		cars[1]=car2;
		cars[2]=car3;
		
		int total = 0;
		int count =0;
		for(int i=0;i<cars.length;i++) {
		    total=total+cars[i].price;
		    count = count+1;
		}
		System.out.println(total/count);
//		for(int i=0;i<cars.length;i++) {
//			if(cars[i].brand.contains("a")) {
//		System.out.println(cars[i].brand+","+cars[i].model+","+cars[i].cc+","+cars[i].price);
//			}
//		}
		

	}

}
class Car {
	String brand;
	String model;
	int cc ;
	int price;
}
