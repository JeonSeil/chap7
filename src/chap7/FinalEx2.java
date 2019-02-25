package chap7;
/*
 * final 변수는 생성자 에서 한번 변경이 가능함. 
 *    => 객체별로 다른 상수값을 가질 수 있다.
 */
class Card {
	final String type;
	final int number; //명시적 초기화
	Card() {
		this("Spade",1);
	}
	Card(String type, int number) {
		this.type = type;
		this.number = number;
	//	this.number = 100;
	}
}
public class FinalEx2 {
	public static void main(String[] args) {
		Card c1 = new Card();
		System.out.println(c1.type + "," + c1.number);
		Card c2 = new Card("Clover",1);
		System.out.println(c2.type + "," + c2.number);
//		c2.number = 2;  //number는 상수이므로 변경 불가.
		
	}
}
