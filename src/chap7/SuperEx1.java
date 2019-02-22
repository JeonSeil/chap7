package chap7;

/*
 * super : �θ� ��ü�� �����ϴ� ����. �θ�ü��������
 *         �ν��Ͻ� ��������� ����� ������. 
 * super() : �θ� Ŭ������ �����ڸ� ȣ��
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
		// super �������� ���Ұ�. main �޼���� static �����
		// System.out.println(super.toString());
	}
}
