package chap7;
/*
 * 부모클래스와 자손클래스가 동일한 멤버를 소유하고 있을때
 *  멤버변수는 참조변수의 자료형을 따르고,
 *  멤버메서드는 객체에 최종 오버라이딩된 메서드가 호출된다.
 */
class Parent3{
	int x = 10;
	void method() {
		System.out.println("Parent3 클래스의 method()");
	}
}
class Child3 extends Parent3{
	int x = 20;
	void method() {
		System.out.println("Child3 클래스의 method()");
	}
}
public class BindingEx1 {
	public static void main(String[] args) {
		Parent3 p = new Child3();
		System.out.println(p.x);
		p.method();
		Child3 c = (Child3)p;
		System.out.println(c.x);
		c.method();
	}
}
