package chap7;
/*
 * 1. Animal 클래스 => 추상클래스
 *    멤버변수 : 동물의종류, 다리수
 *    생성자 : 멤버변수를 입력받아서 생성
 *    멤버메서드 : void eat(); => 추상메서드
 *              String sound(); => 추상메서드
 * 2. Dog클래스
 *    멤버메서드     void eat();  => "주인이 주는대로 먹는다"
 *              String sound();  => "멍멍"        
 * 3. Lion클래스
 *    멤버메서드     void eat();  => "초식동물을 사냥해서 먹는다"
 *              String sound();  => "어흥"        
 */
abstract class Animal {
	String type;
	int leg;
	Animal(String type,int leg) {
		this.type = type;
		this.leg = leg;
	}
	abstract void eat();
	abstract String sound();
}
class Dog extends Animal {
	Dog() {
		super("강아지", 4);
	}
	@Override
	void eat() {
		System.out.println("주인이 주는대로 먹는다");
	}
	@Override
	String sound() {
		return "멍멍";
	}
}
class Lion extends Animal {
	Lion() {
		super("사자", 4);
	}
	@Override
	void eat() {
		System.out.println("초식동물을 사냥해서 먹는다");
	}
	@Override
	String sound() {
		return "어흥";
	}
}
/*
 * 동물을 배열에 이용하여 저장하고, 동물별로 eat() 메서드와 sound() 메서드를 호출하기
 */
public class AnimalEx1 {
	public static void main(String[] args) {
		//추상클래스는 직접 객체 생성 안됨
		//Animal a = new Animal("동물",0);
		Animal[] animals = new Animal[2];
		animals[0] = new Dog();
		animals[1] = new Lion();
		for(Animal a : animals) {
			System.out.println(a.type + "===>" );
			System.out.println(a.sound());
			a.eat();
		}
	}
}
