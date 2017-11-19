package ch07;

/**
 * @author zxcv5500
 * 다형성
 * 상속받은 자식에 중복되는 멤버가 없으면 그냥 부모꺼 다 씀.
 */
class BindingTest2 {

	public static void main(String[] args) {
		Parent04 p = new Child04();
		Child04 c = new Child04();
		
		System.out.println("p.x = " + p.x);
		p.method();
		
		System.out.println("c.x = " + c.x);
		c.method();
		
	}

}


class Parent04 {
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Child04 extends Parent04 {
	
}