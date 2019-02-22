package chap7;
/*
 * 추상클래스
 *   - 추상메서드를 가질 수 있는 클래스. abstract 예약어로 구현됨.
 *   - 객체화 불가.객체화는 반드시 상속을 통해서 자손클래스의 객체화로 객체화가 가능함.
 *     => 객체화되는 자손클래스는 추상메서드를 반드시 오버라이딩 해야 함.
 *   - 그외는 일반클래스와 같다. (생성자, 멤버변수, 멤버메서드...)
 *   - 업무의 표준화에 사용됨.
 *   
 *  추상메서드 
 *   - 선언부만 존재하는 메서드. 구현부{  }가 없다.
 *   - 객체화되는 자손클래스에서 반드시 오버라이딩이 필요하다.    
 */
abstract class Shape {   //추상클래스
	String type;
	Shape(String type) {
		this.type = type;
	}
	abstract double area();    //추상메서드
	abstract double length();  //추상메서드
}
class Circle extends Shape {
	int r;
	Circle(int r) {
		super("원");
		this.r = r;
	}
	double area() {
		return Math.PI * r * r;
	}
	double length() {
		return Math.PI * r * 2;
	}
}
/*
 * Rectangle 클래스를 구현.Shape 클래스를 상속받아 구현하기
 *  멤버변수 : width, height
 */
class Rectangle extends Shape {
	int width, height;
	Rectangle(int width, int height) {
		super("사각형");
		this.width = width;
		this.height = height;
	}
	double area() {
		return width * height;
	}
	double length() {
		return (width + height) * 2;
	}
}
public class ShapeEx1 {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[2];
		shapes[0] = new Circle(10);
		shapes[1] = new Rectangle(10,10);
		for(Shape s : shapes) {
			System.out.println(s.type + "의 넓이 :" + s.area() + ",둘레:"+s.length());
		}
	}
}
