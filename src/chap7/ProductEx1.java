package chap7;
/*
 * 전자제품(Product) 클래스
 *   변수 : 가격, 포인트
 *   생성자 : 가격을 매개변수로 가진 클래스
 *          가격을 저장하고, 포인트는 가격의 1/10로 정한다.
 * TV 클래스 
 *   생성자 : 매개변수 없는 생성자한개만 있다.
 *   메서드 : toString()메서드  
 *            "Tv" 리턴한다.         
 * Computer 클래스 
 *   생성자 : 매개변수 없는 생성자한개만 있다.
 *   메서드 : toString()메서드  
 *            "Computer" 리턴한다.         
 */
class Product {
	int price, point;
	Product(int price) {
		this.price = price;
		this.point = price/10;
	}
}
class Tv extends Product {
	Tv() {
		super(200);
	}
	public String toString() {
		return "Tv";
	}
}
class Computer extends Product {
	Computer() {
		super(250);
	}
	public String toString() {
		return "Computer";
	}
}
/*
 * 고객(Buyer) 클래스
 *    변수 : int money, int point, Product[2] cart 
 *    메서드 : void buy(Product)
 *           제품을 구매할때 마다 현재 현금에서 가격만큼 차감되고, 포인트는 쌓인다.
 *           해당 제품을 cart에 저장함.
 */
class Buyer {
	int money=500;
	int point;
	Product[] cart = new Product[2];
	int index;
	void buy(Product p) {
		money -= p.price;
		point += p.point;
		cart[index++] = p;
		System.out.println(p + "구입");
	}
	void summary() {
		int sum = 0;
		String itemlist = "";
		for(int i=0;i<index;i++) {
			sum += cart[i].price;
			itemlist += cart[i] + ((i==index-1)?"":",");
		}
		System.out.println("총구매금액 :" + sum);
		System.out.println("구매 목록:" + itemlist);
	}
}
public class ProductEx1 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		Tv t = new Tv();
		Computer c = new Computer();
		b.buy(t);
		b.buy(c);
		System.out.println("구매 후 잔액 :" + b.money);
		System.out.println("저장된 포인트 :" + b.point);
		b.summary();  //총구매금액 : 450
		              //구매 목록 : Tv,Computer
	}
}
