package ch07;

import java.util.Vector;

//* 상속관계에 있는 제품 클래스 영
class Product05 {
	int price;
	int bonusPoint;
	
	Product05(int price) {
		this.price = price;
		bonusPoint = (int) (price/10.0);
	}
	
	Product05() {
		price = 0;
		bonusPoint = 0;
	}
}

class Tv05 extends Product05 {
	Tv05() { super(100); }
	
	public String toString() {
		return "Tv05";
	}

}

class Computer05 extends Product05 {
	Computer05() {
		super(200);
	}
	
	public String toString() {
		return "Computer05";
	}
}

class Audio05 extends Product05 {
	Audio05() {
		super(50);
	}
	
	public String toString() {
		return "Audio05";
	}
}
//*/

//* 물건을 구입하는 사람을 나타내는 클래스
/**
 * @author sharpen
 * 배열은 갯수가 한정적인 단점이 있다 그래서 Vector라는 예전버전의 콜렉션을 사용해서 개선한 코드를 적용해 본다.
 */
class Buyer05 {									// 고객, 물건을 사는 사
	int money = 1000;							// 소유 금액
	int bonusPoint = 0;							// 보너스 점수
	Vector item = new Vector<>();				// 구입한 제품을 저장하는데 사용될 Vector 객체
	
	
	void buy(Product05 p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);
		System.out.println(p + "을/를 구입하셨습니다.");
		
	}
	
	void refund(Product05 p) {
		if (item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "을/를 반품하셨습니다.");
		} else {
			System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
		}
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		if (item.isEmpty()) {
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}
		
		// 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
		for (int i = 0; i<item.size(); i++) {
			Product05 p = (Product05) item.get(i);
			sum += p.price;
			itemList += (i==0) ? "" + p : ", " + p;
		}
		
		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
	
}
//*/


public class PolyArgumentTest3 {

	public static void main(String[] args) {
		Buyer05 b = new Buyer05();
		Tv05 tv = new Tv05();
		Computer05 com = new Computer05();
		Audio05 audio = new Audio05();
		
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
		System.out.println();
		b.refund(com);
		b.summary();
	}

}
