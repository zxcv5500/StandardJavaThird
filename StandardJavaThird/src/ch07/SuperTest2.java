package ch07;

/**
 * @author zxcv5500
 * 조상클래스에도 int x = 20 가 있고 자식클래스에도 int x = 10이 있을 때는 
 * super.x =10는 조상의 x변수를 나타내고
 * 자식의 this.x = 20는 자식 자신의 변수를 나타낸다. 
 */
public class SuperTest2 {

	public static void main(String[] args) {
		Child02 c = new Child02();
		c.method();
	}

}


class Parent02 {
	int x = 10;
}

class Child02 extends Parent {
	int x = 20;
	
	void method() {
		System.out.println("x= " + x);
		System.out.println("this.x= " + this.x);
		System.out.println("super.x= " + super.x);
		
	}
	
}