package chap7;

/*
 * super : 부모 객체를 참조하는 변수. 부모객체참조변수
 *         인스턴스 멤버에서만 사용이 가능함. 
 * super() : 부모 클래스의 생성자를 호출
 */
class Parent {
	int x = 10;

	public Parent() {
		super();
	}
}

class Child extends Parent {
	int x = 20;

//	public Child() {
//		super();
//	}

	void method() {
		int x = 30;
		System.out.println(x); // 10
		System.out.println(this.x); // 10
		System.out.println(super.x); // 10
		System.out.println(super.toString());
	}
}

public class SuperEx1 extends Object {
	public static void main(String[] args) {
		Child c = new Child();
		c.method();
		// super 참조변수 사용불가. main 메서드는 static 멤버임
		// System.out.println(super.toString());
	}
}
