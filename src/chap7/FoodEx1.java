package chap7;
/*
 * Food, Fruit, Drink, Snack, Apple, Peach, Cock, Cidar, Biscuit, Cookie 클래스 구현하기
 * 모든 식료품(Food)는 가격(price)과 보너스포인트(point)를 가지고 있다.
 * 식료품 객체를 생성하기 위해서는 가격을 입력받고, 1/10을 포인트로 설정한다.
 * 식료품의 종류는 과일(Fruit),음료(Drink),과자(Snack) 종류로 나눈다.
 * 과일은 당도(brix)를, 음료는 용량(ml), 과자는 무게(gram) 정보를 가지고 있다.
 * 과일에는 사과(Apple),복숭아(Peack)가 있고,
 * 음료에는 콜라(Cock),사이다(Cidar)가 있고,
 * 과자에는 비스킷(Biscuit),쿠키(Cookie)가 있다.
 * 사과와 복숭아는 가격과 당도를 입력받아 객체를 생성하고
 * 콜라와 사이다는 가격과 용량을 입력받아 객체를 생성하고,
 * 비스킷과쿠키는 가격과 무게를 입력받아 객체를 생성하다.
 * 
 * 위의 조건에 맞도록 클래스 구현하기
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
		return "사과";
	}
}
class Peach extends Fruit {
	Peach(int price, double brix) {
		super(price, brix);
	}
	public String toString() {
		return "복숭아";
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
		return "콜라";
	}
}
class Cider extends Drink {
	Cider(int price,int ml) {
		super(price,ml);
	}
	public String toString() {
		return "사이다";
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
		return "비스킷";
	}
}
class Cookie extends Snack {
	Cookie(int price, int gram) {
		super(price,gram);
	}
	public String toString() {
		return "쿠키";
	}
}
/*
 * Buyer2 클래스 구현하기
 *   멤버 변수 : money, point, Food[] cart, fruitcnt, drinkcnt, snackcnt , cnt
 *   메서드 : void buy(Food) 
 *          기능 : 물건 구입시마다 가격만큼 money 차감하고, 포인트 증가시키기.
 *                구입하려는 물건의 값이 큰 경우는 "잔액 부족" 메세지를 출력하기 buy 메서드 종료하기.
 *                구입시는 구입한 물품명과 가격을 출력하기. 장바구니에 물건을 넣어주고,
 *                fruitcnt, drinkcnt, snackcnt,cnt 을 증가시키기.
 *   메서드 : void summary()
 *         기능 : 장바구니에 있는 물건을 조회하여 물건 목록과 총가격  출력하기
 *               과일의 갯수, 과일 목록, 과일 구매금액
 *               음료의갯수, 음료목록, 음료 구매금액
 *               과자의갯수, 과자목록, 과자 구매금액 출력하기.
 *               남은 금액과 보유 포인트 출력하기                             
 */
class Buyer2 {
	int money = 10000;
	int point;
	Food[] cart = new Food[20];
	int fruitcnt, drinkcnt,snackcnt, cnt;
	void buy(Food f) {
		if(money < f.price) {
			System.out.println(f + "구입하려면 잔액이 부족 합니다.");
			return;
		}
		money -= f.price;
		point += f.point;
		System.out.println(f + " 구입. 물품 가격 :" + f.price);
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
		     ("총 구매건수:" +cnt+ ", 총구매금액 : " + sum + ", 구매목록 :" + foodlist);
		System.out.println
	     ("과일 구매건수:" +fruitcnt+ ", 구매금액 : " + fruitsum + ", 구매목록 :" + fruitlist);
		System.out.println
	     ("음료 구매건수:" +drinkcnt+ ", 구매금액 : " + drinksum + ", 구매목록 :" + drinklist);
		System.out.println
	     ("과자 구매건수:" +snackcnt+ ", 구매금액 : " + snacksum + ", 구매목록 :" + snacklist);
		System.out.println("현재 잔액 :" + money + ", 보유포인트 : " + point);
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
