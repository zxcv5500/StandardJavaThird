package ch09;

class Circle02 implements Cloneable {
	Point02 p;					// 원점
	double r;					// 반지름
	
	
	Circle02(Point02 p, double r) {
		this.p = p;
		this.r = r;
	}
	
	public Circle02 shallowCopy() {			// 얕은 복사
		Object obj = null;
		
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) { }
		
		return (Circle02) obj;
	}
	
	public Circle02 deepCopy() {			// 깊은 복사
		Object obj = null;
		
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) { }
		
		Circle02 c = (Circle02) obj;
		c.p = new Point02(this.p.x, this.p.y);
		
		return c;
	}
	
	public String toString() {
		return "[p=" + p + ", r=" + r + "]";
	}
}

class Point02 {
	int x;
	int y;
	
	Point02(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "(" + x + ", " + y +")";
	}
}

/**
 * @author zxcv5500
 * 깊은 복사는 한 클래스 안에 다른 클래스를 포함하고 있을 경우
 * clone()메소드를 사용해서 복사를 한 후에 
 * 안에 포함하고 있는 클래스를 new 객체로 생성하고 복사한 포함클래스의 내부값들을 다시 새로 생성한 곳으로 넘겨주는 방식이다.
 */
class ShallowDeepCopy {

	public static void main(String[] args) {
		Circle02 c1 = new Circle02(new Point02(1, 1), 2.0);
		Circle02 c2 = c1.shallowCopy();
		Circle02 c3 = c1.deepCopy();
		
		System.out.println("c1=" + c1);
		System.out.println("c2=" + c2);
		System.out.println("c3=" + c3);
		c1.p.x = 9;
		c1.p.y = 9;
		System.out.println("= c1의 변경 후");
		System.out.println("c1=" + c1);
		System.out.println("c2=" + c2);
		System.out.println("c3=" + c3);
	}

}
