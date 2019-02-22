package chap7;
/*
 * 오버라이딩 예제
 * 오버라이딩 : 부모클래스의 기능을 자손클래스에서 재정의 하는 것을 말한다.
 */
class Bike {
	int wheel;
	Bike(int wheel) {
		this.wheel = wheel;
	}
	String drive() {
		return "페달을 밟는다";
	}
	String stop() {
		return "브레이크를 잡는다";
	}
}
class AutoBike extends Bike {
	AutoBike(int wheel) {
		super(wheel);
	}
	@Override   //어노테이션, 오버라이딩 된 메서드로 확인. 오버라이딩 조건을 만족한 메서드임. 
	String drive() {
		return "시작버튼을 누른다";
	}
	@Override 
	String stop() {
		return "멈춤 버튼을 누른다.";
	}
}
public class BikeEx1 {
	public static void main(String[] args) {
		AutoBike ab = new AutoBike(2);
		System.out.println(ab.drive());
		System.out.println(ab.wheel + "개의 바퀴가  굴러 갑니다");
		System.out.println(ab.stop());
		Bike b = new Bike(4);
		System.out.println(b.drive());
		System.out.println(b.wheel + "개의 바퀴가  굴러 갑니다");
		System.out.println(b.stop());
	}
}
