package chap7;
class Bike2 {
	int wheel;
	Bike2(int wheel) {
		this.wheel = wheel;
	}
	void drive() {
		System.out.println("페달을 밟고 움직인다.");
	}
	void stop() {
		System.out.println("브레이크를 잡고 멈춘다.");
	}
}
class AutoBike2 extends Bike2 {
	boolean power;
	AutoBike2(int wheel) {
		super(wheel);
	}
	void power() {
		power = !power;
		if(power) System.out.println("전원이 켜졌습니다.");
		else System.out.println("전원이 꺼졌습니다.");
	}
}
public class BikeEx2 {
	public static void main(String[] args) {
		AutoBike2 ab = new AutoBike2(2);
		AutoBike2 ab2;
		Bike2 b;
		ab.power();
		ab.drive();
		System.out.println(ab.wheel + "개의 바퀴가 굴러 간다.");
		ab.stop();
		b =(Bike2)ab;  //형변환 연산자 생략 가능
//		b.power();  //Bike2의 멤버가 아님. 접근 할 수 없다.
		b.drive();
		System.out.println(b.wheel + "개의 바퀴가 굴러 간다.");
		b.stop();
		ab2 =(AutoBike2)b; //형변환 연산자 생략 불가
		ab2.power();
		ab2.drive();
		System.out.println(ab2.wheel + "개의 바퀴가 굴러 간다.");
		ab2.stop();
		
	}
}
