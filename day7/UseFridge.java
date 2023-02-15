package com.onesoft.day7;

public class UseFridge {

	public static void main(String[] args) {
		Fridge fridge1 = new Fridge();
		fridge1.brand = "samsung";
		fridge1.price = 1000;
		fridge1.isDoubleBoor = false;
		fridge1.taxPercent = 10;
		fridge1.discount = 5;
		Fridge fridge2 = new Fridge();
		fridge2.brand = "whirlpool";
		fridge2.price = 2500;
		fridge2.isDoubleBoor = true;
		fridge2.taxPercent = 10;
		fridge2.discount = 5;
		Fridge fridge3 = new Fridge();
		fridge3.brand = "kelvinator";
		fridge3.price = 1500;
		fridge3.isDoubleBoor = false;
		fridge3.taxPercent = 10;
		fridge3.discount = 5;
		
		Fridge[] fridges = new Fridge[3];
		fridges[0]=fridge1;
		fridges[1]=fridge2;
		fridges[2]=fridge3;
		
//		for(int i=0;i<fridges.length;i++) {
//			System.out.println(fridges[i].brand+","+fridges[i].price+","+fridges[i].isDoubleBoor);
//		}
//		for(Fridge f:fridges) {
//			System.out.println(f.brand+","+f.price+","+f.isDoubleBoor);
//		}
		//for netprice
		for(Fridge g:fridges) {
			g.netPrice = g.price+(g.price*g.taxPercent/100)-(g.price*g.discount/100);
			System.out.println(g.netPrice);
		}
		// maximum net price
		Fridge max = fridge1;
		for(Fridge e:fridges) {
			if(max.netPrice<=e.netPrice) {
				max=e;
			}
		}
		System.out.println(max.netPrice);
		
		//minimum net price
		Fridge mini = fridge1;
		for(int i=0;i<fridges.length;i++) {
			if(mini.netPrice>=fridges[i].netPrice) {
				mini=fridges[i];
			}
		}
		System.out.println(mini.brand+","+mini.netPrice);
		
		// to get a brand name and assign
		String[] brands = new String[fridges.length];
		for(int i=0;i<fridges.length;i++) {
			brands[i]=fridges[i].brand;
			System.out.println(brands[i]);
		}
		System.out.println(fridge1.brand);

	}

}
class Fridge {
	String brand;
	int price;
	boolean isDoubleBoor;
	int netPrice;
	int taxPercent;
	int discount;
}
