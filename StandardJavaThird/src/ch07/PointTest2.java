package ch07;

/**
 * @author zxcv5500
 * Point3D03클래스의 인스턴스를 생성할 때 어떤 순서로 인스턴스의 초기화가 진행되는 지 보여주기 위한 예제이다.
 * Point3D03 p3 = new Point3D03();와 같이 인스턴스르 생성하게 되면, 아래의 순서로 생성자가 호출된다.
 * Point3D03() -> Point3D03(int x, int y, int z) -> Point03(int x, int y) -> Object()
 */
class PointTest2 {

	public static void main(String[] args) {
		Point3D03 p3 = new Point3D03();
		System.out.println("p3.x=" + p3.x);
		System.out.println("p3.y=" + p3.y);
		System.out.println("p3.z=" + p3.z);
	}

}


class Point03 {
	int x = 10;
	int y = 20;
	
	public Point03(int x, int y) {
//		super(); //원래는 Object클래스의 생성자가 존재해야 하지만 생략해서 표현된다. 컴파일러가 알아서 껴넣는다.
		this.x = x;
		this.y = y;
	}
	
	
}

class Point3D03 extends Point03 {
	int z = 30;
	
	Point3D03() {
		this(100, 200, 300);	// Point3D03(int x, int y, int z)를 호출한다.
	}
	
	Point3D03(int x, int y, int z) {
		super(x, y);			// Point03(int x, int y)를 호출한다.
		this.z = z;
	}
	
	
}