package ch07;

/**
 * @author zxcv5500
 * 부모에만 있는 인스턴스 변수라서 
 * x , this.x, super.x
 * 모든 게 부모 클래스의 int x = 10을 의미한다.
 */
public class SuperTest {

	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}

}

class Parent {
	int x = 10;
}

class Child extends Parent {
	void method() {
		System.out.println("x= " + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x= " + super.x);
	}
}
