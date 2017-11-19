package ch07;

/**
 * @author zxcv5500
 * 멤버변수는 선언 타입에 따라 갈림 Parent03 p = 에 따라
 * 메서드는 new Child03() 부분처럼 생성 인스턴스 부분을 따라간다. 
 */
class BindingTest {
	public static void main(String[] args) {
		Parent03 p = new Child03();
		Child03 c = new Child03();
		
		System.out.println("p.x = " + p.x);
		p.method();
		
		System.out.println("c.x = " + c.x);
		c.method();
		
	}
	
	
}

class Parent03 {
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Child03 extends Parent03 {
	int x = 200;
	
	void method() {
		System.out.println("Child Method");
	}
}
