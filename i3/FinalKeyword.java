package com.onesoft.i3;

public class FinalKeyword {

	public static void main(String[] args) {
		Car1 c = new Car1();
		c.speed();

		}

		}
		final class Car1{
		final int speed=70;
		//int speed =60;
		public final void speed() {
		System.out.println(speed);
		}
		}
//		class Car2 extends Car1 {
//		public void speed() {
//		System.out.println("100");
//
//	}
//
//}
