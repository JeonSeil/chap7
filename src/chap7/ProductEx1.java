package chap7;
/*
 * ������ǰ(Product) Ŭ����
 *   ���� : ����, ����Ʈ
 *   ������ : ������ �Ű������� ���� Ŭ����
 *          ������ �����ϰ�, ����Ʈ�� ������ 1/10�� ���Ѵ�.
 * TV Ŭ���� 
 *   ������ : �Ű����� ���� �������Ѱ��� �ִ�.
 *   �޼��� : toString()�޼���  
 *            "Tv" �����Ѵ�.         
 * Computer Ŭ���� 
 *   ������ : �Ű����� ���� �������Ѱ��� �ִ�.
 *   �޼��� : toString()�޼���  
 *            "Computer" �����Ѵ�.         
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
 * ��(Buyer) Ŭ����
 *    ���� : int money, int point, Product[2] cart 
 *    �޼��� : void buy(Product)
 *           ��ǰ�� �����Ҷ� ���� ���� ���ݿ��� ���ݸ�ŭ �����ǰ�, ����Ʈ�� ���δ�.
 *           �ش� ��ǰ�� cart�� ������.
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
		System.out.println(p + "����");
	}
	void summary() {
		int sum = 0;
		String itemlist = "";
		for(int i=0;i<index;i++) {
			sum += cart[i].price;
			itemlist += cart[i] + ((i==index-1)?"":",");
		}
		System.out.println("�ѱ��űݾ� :" + sum);
		System.out.println("���� ���:" + itemlist);
	}
}
public class ProductEx1 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		Tv t = new Tv();
		Computer c = new Computer();
		b.buy(t);
		b.buy(c);
		System.out.println("���� �� �ܾ� :" + b.money);
		System.out.println("����� ����Ʈ :" + b.point);
		b.summary();  //�ѱ��űݾ� : 450
		              //���� ��� : Tv,Computer
	}
}
