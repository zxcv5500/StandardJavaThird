package ch06;

/**
 * @author zxcv5500
 * 매개변수가 있는 생성자.
 */
class Car {
	String color;				// 색상
	String gearType;			// 변속기 종류 - auto(자동), manual(수동)
	int door;					// 문의 개수
	
	Car() {}					// default constructor(기본생성자) 만들어둠.
	
	Car(String c, String g, int d) {
		color = c;
		gearType = g;
		door = d;
	}
}

public class CarTest {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		Car c2 = new Car("white", "auto", 4);		// 매개변수를 갖는 생성자를 사용하는 것이 코드를 보다 간결하고 직관적으로 만든다.
		
		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);
	}

}
