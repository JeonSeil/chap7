package test;

/*
 SutdaCard 20장으로 이루어진 SutdaDeck 클래스 구현하기
  1. 멤버 변수
      SutdaCard 20장을 가지고 있다. 
      SutdaCard는 같은 수의 카드를 2장씩 총 20장으로 이루어져 있다.
      그중 1,3,8번호의 카드는 두장 중 한장이 광인 카드다.
  2. 생성자
     매개변수는 없고, SutdaCard 20장을 생성하여 멤버 변수인 배열에 저장하기
  3. 메서드
    a. void shuffle() 
       기능 : 카드의 위치를 뒤섞는다.
    b. SutdaCard pick(int index)
       기능 : index에 해당하는 카드 한장을 반환한다.          
    c. SutdaCard pick()
       기능 : 임의의 카드 한장을 반환한다.          

  구동 클래스를 실행할때 결과
1:1K,2,3K,4,5,6,7,8K,9,10,1,2,3,4,5,6,7,8,9,10
2:5,6,6,8K,4,2,8,3K,3,9,10,7,9,1,5,1K,4,10,2,7
3:5
4:4

단 2,3,4 번은 랜덤하게 출력된다.
*/
class SutdaDeck {
	SutdaCard[] cards;
	SutdaDeck() {
		cards =  new SutdaCard[20];
		for(int i=0;i < cards.length;i++) {
			cards[i] = new SutdaCard(i%10+1,(i==0||i==2||i==7)?true:false);
		}
	}
	void shuffle() {
		for(int i=0;i<10000;i++) {
			int f = (int)(Math.random()*20);
			int t = (int)(Math.random()*20);
			SutdaCard s = cards[f];
			cards[f] = cards[t];
			cards[t] = s;
		}
	}
	public String toString() {
		String s = "";
		for(SutdaCard c : cards) {
			s += c + ",";
		}
		return s;
	}
	SutdaCard pick(int index) {
		return cards[index];
	}
	SutdaCard pick() {
		return cards[(int)(Math.random()*20)];
	}
}
class SutdaCard {
	int number;
	boolean isKwang;
	SutdaCard(int number,boolean isKwang) {
		this.number = number;
		this.isKwang = isKwang;
	}
	public String toString() {
		 return number + (isKwang?"K":"");	
	}
	public String info() {
		 return number + (isKwang?"K":"");	
	}
	
}
public class Exam1 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		System.out.println("1:" + deck.toString());
		deck.shuffle();
		System.out.println("2:" + deck);
		System.out.println("3:" + deck.pick(0).info());
		System.out.println("4:" + deck.pick().info());
	}
}
