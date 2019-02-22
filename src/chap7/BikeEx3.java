package chap7;

public class BikeEx3 {
	public static void main(String[] args) {
		Bike2 b = new AutoBike2(2);
		AutoBike2 ab = (AutoBike2)b;
		ab.power();
		ab.drive();
	}
}
