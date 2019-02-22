package chap7;

public class BikeEx3 {
	public static void main(String[] args) {
		Bike2 b = new AutoBike2(2);
		//instanceof 연산자  : 참조변수와 객체와의 관계 확인
		if(b instanceof Bike2) {
			System.out.println("b 참조변수가 참조하는 객체는 Bike2 객체임");
		}
		if(b instanceof AutoBike2) {
			System.out.println("b 참조변수가 참조하는 객체는 AutoBike2 객체임");
			AutoBike2 ab = (AutoBike2)b;
			ab.power();
			ab.drive();
		}
		if (b instanceof Object) {
			System.out.println("b 참조변수가 참조하는 객체는 Object 객체다");
		}
		String s = "";
		if (s instanceof Object) {
			System.out.println("s 참조변수가 참조하는 객체는 Object 객체다");
		}
	}
}
