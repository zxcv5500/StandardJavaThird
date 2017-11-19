package ch07;

/**
 * @author zxcv5500
 * 멤버변수가 중복되는 경우엔 선언한 타입 Parent05 p 처럼 타입에 따라 변수형에 따라 달라진다.
 * 
 * 메서드는 인스턴스화한 new Child05()의 영향을 받으므로 Parent05의 method()는 이 코드에 따르면 사용되지 않는다.
 * Parent05 p2 = new Parent05();로 선언한다면 new Parent05()의 method() 메소드 내용을 출력할 수 있게 된다. 
 * 
 */
class BindingTest3 {

	public static void main(String[] args) {
		Parent05 p = new Child05();
		Child05 c = new Child05();
		// Parent05 p2 = new Parent05();
		
		System.out.println("p.x = " + p.x);
		p.method();
		System.out.println();
		System.out.println("c.x = " + c.x);
		c.method();
		/*//
		System.out.println();
		System.out.println("p2.x = " + p2.x);
		p2.method();
		*/
	}

}

class Parent05 {
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Child05 extends Parent05 {
	int x = 200;
	
	void method() {
		System.out.println("x=" + x);						// this.x와 같다.
		System.out.println("super.x = " + super.x);			// super.x
		System.out.println("this.x = + " + this.x);			
	}
}

