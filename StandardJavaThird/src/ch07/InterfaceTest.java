package ch07;

class A {
	public void methodA(B b) {
		b.methodB();
	}
}

class B {
	public void methodB() {
		System.out.println("methodB");
	}
}


/**
 * @author sharpen
 * 인터페이스의 이해
 * 이렇게 직접 다른 클래스B의 메소드를 호출하면 
 * B클래스가 일단 먼저 존재해야되고 methodB()가 바뀌면 코드에 직접적인 영향을 받는다.  
 */
class InterfaceTest {

	public static void main(String[] args) {
		A a = new A();
		a.methodA(new B());
	}

}
