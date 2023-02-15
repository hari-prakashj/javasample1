package com.onesoft.java8;

public interface Electronics {
	public static void onOff(boolean isOn) {
		if(isOn) {
			System.out.println("The machine is running");
		}
		else {
			System.out.println("not working");
		}
	}

}
