package chap7;
/*
 * Food, Fruit, Drink, Snack, Apple, Peach, Cock, Cidar, Biscuit, Cookie Ŭ���� �����ϱ�
 * ��� �ķ�ǰ(Food)�� ����(price)�� ���ʽ�����Ʈ(point)�� ������ �ִ�.
 * �ķ�ǰ ��ü�� �����ϱ� ���ؼ��� ������ �Է¹ް�, 1/10�� ����Ʈ�� �����Ѵ�.
 * �ķ�ǰ�� ������ ����(Fruit),����(Drink),����(Snack) ������ ������.
 * ������ �絵(brix)��, ����� �뷮(ml), ���ڴ� ����(gram) ������ ������ �ִ�.
 * ���Ͽ��� ���(Apple),������(Peack)�� �ְ�,
 * ���ῡ�� �ݶ�(Cock),���̴�(Cidar)�� �ְ�,
 * ���ڿ��� ��Ŷ(Biscuit),��Ű(Cookie)�� �ִ�.
 * ����� �����ƴ� ���ݰ� �絵�� �Է¹޾� ��ü�� �����ϰ�
 * �ݶ�� ���̴ٴ� ���ݰ� �뷮�� �Է¹޾� ��ü�� �����ϰ�,
 * ��Ŷ����Ű�� ���ݰ� ���Ը� �Է¹޾� ��ü�� �����ϴ�.
 * 
 * ���� ���ǿ� �µ��� Ŭ���� �����ϱ�
 */
class Food {
	int price, point;
	Food(int price) {
		this.price = price;
		point = price/10;
	}
}
class Fruit extends Food {
	double brix;
	Fruit(int price, double brix) {
		super(price);
		this.brix = brix;
	}
}
class Apple extends Fruit {
	Apple(int price, double brix) {
		super(price, brix);
	}
	public String toString() {
		return "���";
	}
}
class Peach extends Fruit {
	Peach(int price, double brix) {
		super(price, brix);
	}
	public String toString() {
		return "������";
	}
}
class Drink extends Food {
	int ml;
	Drink(int price,int ml){
		super(price);
		this.ml = ml;
	}
}
class Cock extends Drink {
	Cock(int price,int ml) {
		super(price,ml);
	}
	public String toString() {
		return "�ݶ�";
	}
}
class Cider extends Drink {
	Cider(int price,int ml) {
		super(price,ml);
	}
	public String toString() {
		return "���̴�";
	}
}
class Snack extends Food {
	int gram;
	Snack(int price, int gram){
		super(price);
		this.gram = gram;
	}
}
class Biscuit extends Snack {
	Biscuit(int price, int gram) {
		super(price,gram);
	}
	public String toString() {
		return "��Ŷ";
	}
}
class Cookie extends Snack {
	Cookie(int price, int gram) {
		super(price,gram);
	}
	public String toString() {
		return "��Ű";
	}
}
/*
 * Buyer2 Ŭ���� �����ϱ�
 *   ��� ���� : money, point, Food[] cart, fruitcnt, drinkcnt, snackcnt , cnt
 *   �޼��� : void buy(Food) 
 *          ��� : ���� ���Խø��� ���ݸ�ŭ money �����ϰ�, ����Ʈ ������Ű��.
 *                �����Ϸ��� ������ ���� ū ���� "�ܾ� ����" �޼����� ����ϱ� buy �޼��� �����ϱ�.
 *                ���Խô� ������ ��ǰ��� ������ ����ϱ�. ��ٱ��Ͽ� ������ �־��ְ�,
 *                fruitcnt, drinkcnt, snackcnt,cnt �� ������Ű��.
 *   �޼��� : void summary()
 *         ��� : ��ٱ��Ͽ� �ִ� ������ ��ȸ�Ͽ� ���� ��ϰ� �Ѱ���  ����ϱ�
 *               ������ ����, ���� ���, ���� ���űݾ�
 *               �����ǰ���, ������, ���� ���űݾ�
 *               �����ǰ���, ���ڸ��, ���� ���űݾ� ����ϱ�.
 *               ���� �ݾװ� ���� ����Ʈ ����ϱ�                             
 */
class Buyer2 {
	int money = 10000;
	int point;
	Food[] cart = new Food[20];
	int fruitcnt, drinkcnt,snackcnt, cnt;
	void buy(Food f) {
		if(money < f.price) {
			System.out.println(f + "�����Ϸ��� �ܾ��� ���� �մϴ�.");
			return;
		}
		money -= f.price;
		point += f.point;
		System.out.println(f + " ����. ��ǰ ���� :" + f.price);
		cart[cnt++] = f;
		if(f instanceof Fruit) ++fruitcnt;
		if(f instanceof Drink) ++drinkcnt;
		if(f instanceof Snack) ++snackcnt;
	}
	void summary() {
		String foodlist  = "", fruitlist = "",drinklist= "" , snacklist="";
		int sum =0,fruitsum=0,drinksum=0,snacksum=0;
		for(int i=0;i<cnt;i++) {
			if(cart[i] instanceof Fruit) {
				fruitlist += cart[i];
				fruitsum += cart[i].price;
			} else if(cart[i] instanceof Drink) {
				drinklist += cart[i];
				drinksum += cart[i].price;
			} else {
				snacklist += cart[i];
				snacksum += cart[i].price;
			}
			sum += cart[i].price;
			foodlist += cart[i];
		}
		System.out.println
		     ("�� ���ŰǼ�:" +cnt+ ", �ѱ��űݾ� : " + sum + ", ���Ÿ�� :" + foodlist);
		System.out.println
	     ("���� ���ŰǼ�:" +fruitcnt+ ", ���űݾ� : " + fruitsum + ", ���Ÿ�� :" + fruitlist);
		System.out.println
	     ("���� ���ŰǼ�:" +drinkcnt+ ", ���űݾ� : " + drinksum + ", ���Ÿ�� :" + drinklist);
		System.out.println
	     ("���� ���ŰǼ�:" +snackcnt+ ", ���űݾ� : " + snacksum + ", ���Ÿ�� :" + snacklist);
		System.out.println("���� �ܾ� :" + money + ", ��������Ʈ : " + point);
	}
}
public class FoodEx1 {
	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		Apple a = new Apple(1000,10.5);
		Peach p = new Peach(2000,15.5);
		b.buy(a);b.buy(p);
		b.summary();
	}
}
