package chap7;
/*
 * 상속 예제
 */
class Phone {
	boolean power;
	int number;
	void power() {
		power = !power;
	}
	void send() {
		if(power) System.out.println("전화 걸기");
	}
	void receive() {
		if(power) System.out.println("전화 받기");
	}
}
class SmartPhone extends Phone {
	void setApp(String name) {
		if(power) System.out.println(name + "앱 설치 ");
	}
}
public class PhoneEx1 {
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.power();
		sp.send();
		sp.receive();
		sp.setApp("게임");
	}
}
