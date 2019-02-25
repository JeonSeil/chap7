package chap7;
/*
 * final 제어자 예제
 * final class : 종단클래스 : 상속불가 클래스. 자손클래스를 가질 수 없다. 
 *               다른 클래스의 부모클래스가 될수 없다.
 * final method : 종단메서드 : 재정의(오버라이딩) 불가 메서드.
 * final value : 상수 : 변경 불가 변수.
 *              인스턴스 변수인 경우 생성자에서 한번은 초기화 가능함.=> 단 명시적 초기화가 되지 않아야 한다.
 * 
 * final 제어자와 abstract 제어자는 함께 사용 할 수 없다.
 */
//final class Parent4 {
class Parent4 {
//	final void method() {
	void method() {
		System.out.println("Parent4 클래스의 메서드 임");
	}
}
class Child4 extends Parent4 {
	final int val = 100; //자바에서는 const 예약어 사용하지 않는다.
	final void method() {
		System.out.println("Child4 클래스의 메서드 임");
		//System.out.println(val += 10);
	}
}
public class FinalEx1 {
	public static void main(String[] args) {

	}
}
