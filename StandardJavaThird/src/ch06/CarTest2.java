package ch06;

/**
 * @author zxcv5500
 * 생성자에서 다른 생성자 호출하기 - this(), this
 */
class Car01 {
	String color;						// 색상
	String gearType;					// 변속기 종류 - auto(자동), manual(수동)
	int door;							// 문의 개수
	
	Car01() {
		this("white", "auto", 4);
	}
	
	Car01(String color) {
		this(color, "auto", 4);
	}
	
	Car01(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

public class CarTest2 {

	public static void main(String[] args) {
		Car01 c1 = new Car01();
		Car01 c2 = new Car01("blue");
		
		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);
	}

}
