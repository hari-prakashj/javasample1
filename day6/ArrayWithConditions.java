package com.onesoft.day6;

public class ArrayWithConditions {

	public static void main(String[] args) {
		int[] integer = {-10,25,-87,36,54,0,-93,72};
		int positive=0;
		int ptotal=0;
		int negative=0;
		int ntotal=0;
		int zero=0;
		for(int i=0;i<integer.length;i++) {
			
			if(integer[i]>0) {
				positive++;
				ptotal=ptotal+integer[i];
			}
			else if(integer[i]<0) {
				negative++;
				ntotal=ntotal+integer[i];
			}
			else {
				zero++;
			}
		}
		System.out.println("Positive = "+positive+", Negativie = "+negative+", Zero = "+zero);
		System.out.println("PositiveAvg = "+ptotal/positive+", NegativeAvg = "+ntotal/negative);
	}

}
