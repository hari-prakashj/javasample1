package com.onesoft.day8;

public class UseMaxMini {

	public static void main(String[] args) {
		MaxMini maxmini = new MaxMini();
		int[] num = {10,55,32,26,86,72,11};
		System.out.println(maxmini.findMax(num));
		maxmini.findMini(num);

	}

}
class MaxMini {
	int findMax (int[] a) {
		int max = a[0];
		for(int i=0;i<a.length;i++) {
			if(max<=a[i]) {
				max=a[i];
			}
		}
		return max;
	}
	void findMini(int[] a) {
		int mini = a[0];
		for(int i=0;i<a.length;i++) {
			if(mini>=a[i]) {
				mini=a[i];
			}
		}
		System.out.println(mini);
	}
}