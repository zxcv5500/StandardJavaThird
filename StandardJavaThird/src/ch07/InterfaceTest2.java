package ch07;

class A2 {
	void autoPlay(I i) {
		i.play();
	}
}

interface I {
	public abstract void play();
}

class B2 implements I {
	
	@Override
	public void play() {
		System.out.println("play in B class");
	}
}

class C2 implements I {

	@Override
	public void play() {
		System.out.println("play in C class");		
	}
	
}


/**
 * @author sharpen
 * A2클래스에서 다른 클래스의 객체메소드를 사용할 때 interface를 만들어서 사용하게 되면 코드가 유연해진다.
 * 클래스A2가 클래스B2를 직접 호출(사용)하지 않고 인터페이스를 매개체로 해서 클래스A2가 인터페이스를 통해서 클래스 B2의 메서드에 접근하도록 하면
 * 클래스B에 변경사항이 생기거나 클래스 B2와 같은 기능의 다른 클래스로 대체되어도 클래스 A는 전혀 영향을 받지 않도록 하는 것이 가능하다.
 * 
 * Thread의 생성자인 Thread(Runnable target)이 이런 방식으로 되어 있다.
 * JDBC의 DriverManager클래스가 이런 방식으로 되어 있다.
 */
class InterfaceTest2 {

	public static void main(String[] args) {
		A2 a = new A2();
		a.autoPlay(new B2());
		a.autoPlay(new C2());
	}

}
