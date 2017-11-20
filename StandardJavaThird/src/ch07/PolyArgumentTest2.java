package ch07;


/**
 * @author sharpen
 * 모든 제품클래스의 조상인 Product04클래스 타입의 배열을 사용해 구입한 제품을 하나의 배열로 간단하게 다룰 수 있게 된다.
 */
class Product04 {
	int price;						// 제품의 가격
	int bonusPoint;					// 제품구매시  제공하는 보너스점수
	
	Product04(int price) {
		this.price = price;
		bonusPoint = (int) (price/1.0);
	}
	
	Product04() {}					// 기본생성자.
}

class Tv04 extends Product04 {
	Tv04() {
		super(100);
	}
	
	public String toString() { return "Tv04"; }

}

class Computer04 extends Product04 {
	Computer04() {
		super(200);
	}
	
	public String toString() { return "Computer04"; }
}

class Audio04 extends Product04 {
	Audio04() {
		super(50);
	}
	
	public String toString() { return "Audio04"; }
}

class Buyer04 {										// 고객, 물건을 사는 사람
	int money = 1000;								// 소유금액
	int bonusPoint;									// 보너스점수
	Product04[] item = new Product04[10];			// 구입한 제품을 저장하기 위한 배열
	int i = 0;										// Product04배열에 사용될 카운트변수
	
	void buy(Product04 p) {
		if ( money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
		}
		
		money -= p.price;							// 가진 돈에서 구입한 제품의 가격을 뺀다.
		bonusPoint += p.bonusPoint;					// 제품의 보너스 점수를 추가한다.
		item[i++] = p;								// 제품을 Product04[] item에 저장한다.
		System.out.println(p + "을/를 구입하셨습니다.");
	}
	
	void summary() {								// 구매한 물품에 대한 정보를 요약해서 보여준다.
		int sum = 0;								// 구입한 물품의 가격합계
		String itemList = "";						// 구입한 물품목록
		
		// 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
		for (int i = 0; i < item.length; i++) {
			if ( item[i] == null) break;
			sum += item[i].price;
			itemList += item[i] + ", ";
		}
		
		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
		
	}
	
}

class PolyArgumentTest2 {

	public static void main(String[] args) {
		Buyer04 b = new Buyer04();
		
		b.buy(new Tv04());
		b.buy(new Computer04());
		b.buy(new Audio04());
		b.summary();
	}

}
