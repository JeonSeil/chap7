package chap7;
/*
 * final ������ ������ ���� �ѹ� ������ ������. 
 *    => ��ü���� �ٸ� ������� ���� �� �ִ�.
 */
class Card {
	final String type;
	final int number; //����� �ʱ�ȭ
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
//		c2.number = 2;  //number�� ����̹Ƿ� ���� �Ұ�.
		
	}
}
