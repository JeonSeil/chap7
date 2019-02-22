package chap7;
/*
 * super() 생성자 : 부모 클래스의 생성자를 호출함
 *    자손클래스의 객체생성 시 부모 클래스의 객체를 먼저 생성함.
 *    자손클래스의 생성자에서 super()를 호출함.
 *    만약 부모클래스의 생성자에 매개변수가 없는 생성자가 없으면 반드시 super(부모클래스의 매개변수)에 
 *    맞는 super 생성자를 호출해야 한다.
 */
class Parent2 {
	int x;
	Parent2(int x) {
		this.x = x;
	}
}
class Child2 extends Parent2 {
	int x=20;
	public Child2() {
		super(0);
	}
	void method() {
		int x = 30;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
	}
}
public class SuperEx2 {
	public static void main(String[] args) {
		Child2 c = new Child2();
		c.method();
	}
}
