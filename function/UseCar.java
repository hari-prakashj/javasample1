
public class UseCar {

	public static void main(String[] args) {
	  Car car = new Car();
	  car.brand = "ford";
	  car.price = 1000;
	  car.color = "black";
	  car.num = 1994;
	  System.out.println(car.findPrime(car.num));
		
	}

}
class Car {
	String brand;
	int price;
	String color;
	int num;
	String findPrime(int a) {
		boolean check = true;
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				check=false;
			}
		}
		if(check) {
			return "It is a prime number";
		}
		else {
			return "It is not a prime number";
		}
	}
}
