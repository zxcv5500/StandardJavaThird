package ch06;

/**
 * @author zxcv5500
 * 생성자를 이용한 인스턴스(제품)의 복사
 */
class Car03 {
	String color;				//색상
	String gearType;			// 변속기 종류 - auto(자동), manual(수동)
	int door;					// 문의 개수
	
	Car03() {
		this("white", "auto", 4);
	}
	
	Car03(Car03 c) {				// 인스턴스의 복사를 위한 생성자.
		color = c.color;
		gearType = c.gearType;
		door = c.door;
		// this(c.color, c.gearType, c.door)		// 이렇게 하는 게 좀 더 세련된 코드다. 이미 있는 다른 생성자 코드를 재활용해서 쓴다.
	}
	
	Car03(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

public class CarTest3 {

	public static void main(String[] args) {
		Car03 c1 = new Car03();
		Car03 c2 = new Car03(c1);				// c1의 복사본 c2를 생성한다.
		
		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);
		
		c1.door=100;			// c1의 인스턴스변수 door의 값을 변경한다.
		System.out.println("c1.door=100; 수행후");

		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);
		

	}

}
