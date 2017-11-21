package ch07;

class Parent01 {
	public void method2() {
		System.out.println("method2() in Parent01");
	}
}

interface MyInterface {
	default void method1() {
		System.out.println("method1() in MyInterface");
	}
	
	default void method2() {
		System.out.println("method2() in MyInterface");
	}
	
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface");
	}
}

interface MyInterface2 {
	default void method1() {
		System.out.println("method1() in MyInterface2");
	}
	
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface2");
	}
}




class Child01 extends Parent01 implements MyInterface, MyInterface2 {
	public void method1() {
		System.out.println("method1() in Child01");			// 두 인터페이스에 공통으로 있는 메소드는 상속받는 곳에서 오버라이드로 충돌을 해결한다.
	}
}





/**
 * @author sharpen
 * jdk1.8부터 인터페이스에 추상메서드 외에도 default , static 메서드를 선언할 수 있게 되었다.
 */
class DefaultMethodTest {

	public static void main(String[] args) {
		Child01 c = new Child01();
		c.method1();
		c.method2();
		MyInterface.staticMethod();			//static메소드는 생성되는 각 제품(인스턴스)에 영향을 받지 않는 메소드 이므로 충돌도 고려할 필요가 없다.
		MyInterface2.staticMethod();
	}

}



