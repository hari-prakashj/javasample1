package com.onesoft.i4;

public class SleepWait {
	private static Object z = new Object();

	public static void main(String[] args) throws InterruptedException{
		int[] a = {1,2,3,4,5,6,7,8,9};
		
//		for(int i=0;i<a.length;i++) {
//			Thread.sleep(2000);
//			System.out.println(i);
//		}
		synchronized (z) {
			z.wait(2000);
			System.out.println("hello");
		}
		
	}

}
