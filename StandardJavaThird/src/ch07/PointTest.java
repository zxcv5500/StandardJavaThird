package ch07;

/**
 * @author zxcv5500
 * 생성자의 첫줄이 생성자를 호출하는 문장이 아니기 때문에                                
	조상의 기본생성자를 넣으려고 하는데 조상에 default constructor가 없어서 에러를 낸다.      
	자식클래스에 조상의 생성자 중에 super(x, y);를 삽입해 주거나                       
	부모에 default constructor을 만들어 주면                               
	에러가 나지 않도록 할 수 있다.                                            
 */
class PointTest {

	public static void main(String[] args) {
		Point3D p3 = new Point3D(1, 2, 3);
	}

}

class Point02 {
	int x;
	int y;
	
	Point02(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x : " + x + ", y : " + y;
	}
}


class Point3D extends Point02 {
	int z;
	Point3D(int x, int y, int z) {
//		super(x, y);				// 생성자의 첫줄이 생성자를 호출하는 문장이 아니기 때문에
									// 조상의 기본생성자를 넣으려고 하는데 조상에 default constructor가 없어서 에러를 낸다.
									// 자식클래스에 조상의 생성자 중에 super(x, y);를 삽입해 주거나 
									// 부모에 default constructor을 만들어 주면
									// 에러가 나지 않도록 할 수 있다.
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	String getLocation() {
		return "x : " + x + ", y : " + y + ", z : " + z;
	}
}